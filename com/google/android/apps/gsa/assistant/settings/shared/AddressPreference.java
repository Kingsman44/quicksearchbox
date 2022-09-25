package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7805kp;

/* compiled from: PG */
public class AddressPreference extends Preference {

    /* renamed from: a */
    public C7805kp f194984a;

    /* renamed from: b */
    public int f194985b;

    /* renamed from: c */
    public String f194986c;

    /* renamed from: d */
    private boolean f194987d;

    /* renamed from: e */
    private ViewGroup f194988e;

    public AddressPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: o */
    private final void m108268o() {
        ViewGroup viewGroup = this.f194988e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.f194984a != null ? 0 : 8);
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.AddressPreference.a(androidx.preference.ax):void, dex: classes4.dex
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
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.AddressPreference.a(androidx.preference.ax):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.AddressPreference.mo8313a(androidx.preference.ax):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.AddressPreference.c():void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: c */
    protected final void mo8315c() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.AddressPreference.c():void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.AddressPreference.mo8315c():void");
    }

    /* renamed from: j */
    public final void mo65200j(C7805kp kpVar) {
        this.f194984a = kpVar;
        mo8317e();
        m108268o();
    }

    /* renamed from: l */
    public final void mo65201l() {
        String string = this.f12738j.getString(R.string.device_id_device_address_clear_dialog_message);
        this.f194987d = true;
        this.f194985b = R.string.google_home_device_address_clear_dialog_title;
        this.f194986c = string;
        this.f12719E = R.layout.preference_widget_clear;
    }

    public AddressPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AddressPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
