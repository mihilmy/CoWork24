package com.discover.cowork24;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by ajay on 9/26/2015.
 */

public class StartTimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener{

    Context context;
    StartTimePicker(Context context){
        this.context = context;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Use the current date as the default date in the picker
        TimePickerDialog dialog = new TimePickerDialog(context, this, hour, minute, true);

        return dialog;

    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // TODO Auto-generated method stub

    }
}