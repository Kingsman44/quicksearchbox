package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.CheckBoxPreference;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.o */
/* compiled from: PG */
final class C73042o extends CheckBoxPreference {

    /* renamed from: c */
    public int f193715c;

    /* renamed from: d */
    public View.OnClickListener f193716d;

    /* renamed from: e */
    public View.OnClickListener f193717e;

    /* renamed from: f */
    public boolean f193718f;

    /* renamed from: g */
    public boolean f193719g;

    /* renamed from: h */
    private int f193720h;

    public C73042o(Context context) {
        super(context, (AttributeSet) null);
        this.f12718D = R.layout.calls_preference_incoming_call_settings_enabled;
        this.f12719E = R.layout.preference_widget_radio;
        this.f12751w = false;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.calls.o.a(androidx.preference.ax):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final void mo8313a(androidx.preference.C3998ax r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.calls.o.a(androidx.preference.ax):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.calls.C73042o.mo8313a(androidx.preference.ax):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ae */
    public final void mo64663ae() {
        this.f193720h = R.string.assistant_settings_carrier_cannot_receive_calls_warning_message;
        mo8317e();
    }
}
