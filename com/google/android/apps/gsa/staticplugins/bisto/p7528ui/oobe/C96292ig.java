package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ig */
/* compiled from: PG */
public abstract class C96292ig extends C96098bb {

    /* renamed from: m */
    public C96094ay f269469m;

    /* renamed from: g */
    public final void mo89941g(OpaPageLayout opaPageLayout) {
        super.mo89941g(opaPageLayout);
        Activity activity = getActivity();
        ComponentName callingActivity = activity.getCallingActivity();
        Button button = this.f269034h;
        button.getClass();
        button.setText(R.string.herbie_back);
        Button button2 = this.f269033g;
        button2.getClass();
        button2.setText(R.string.opa_value_proposition_next);
        Button button3 = this.f269034h;
        button3.getClass();
        button3.setVisibility(8);
        if (!(callingActivity == null || callingActivity.getClassName() == null || !callingActivity.getClassName().equals("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.HerbieAudioTestingActivity"))) {
            Button button4 = this.f269034h;
            button4.getClass();
            button4.setVisibility(0);
            Button button5 = this.f269034h;
            button5.getClass();
            button5.setOnClickListener(new C89943l(new C96290ie(this, activity)));
        }
        Button button6 = this.f269033g;
        button6.getClass();
        button6.setOnClickListener(new C89943l(new C96291if(this)));
        C96095az azVar = this.f269050l;
        String str = this.f269469m.f269039a;
        if (azVar != null && str != null) {
            String str2 = azVar.f269043d;
            String name = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str).getName();
            if (str2 != null) {
                mo89945k(String.format(str2, new Object[]{name}));
            }
        }
    }
}
