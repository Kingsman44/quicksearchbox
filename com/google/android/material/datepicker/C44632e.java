package com.google.android.material.datepicker;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.e */
/* compiled from: PG */
public final /* synthetic */ class C44632e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C44634g f116287a;

    /* renamed from: b */
    public final /* synthetic */ String f116288b;

    public /* synthetic */ C44632e(C44634g gVar, String str) {
        this.f116287a = gVar;
        this.f116288b = str;
    }

    public final void run() {
        C44634g gVar = this.f116287a;
        String str = this.f116288b;
        TextInputLayout textInputLayout = gVar.f116291a;
        DateFormat dateFormat = gVar.f116292b;
        Context context = textInputLayout.getContext();
        String string = context.getString(R.string.mtrl_picker_invalid_format);
        String format = String.format(context.getString(R.string.mtrl_picker_invalid_format_use), new Object[]{C44634g.m79091c(str)});
        String format2 = String.format(context.getString(R.string.mtrl_picker_invalid_format_example), new Object[]{C44634g.m79091c(dateFormat.format(new Date(C44625au.m79085f().getTimeInMillis())))});
        textInputLayout.mo48470e(string + "\n" + format + "\n" + format2);
        gVar.mo47860a();
    }
}
