package com.google.android.apps.gsa.assistant.settings.shared;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.PreferenceCategory;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.googlequicksearchbox.R;

@ProguardMustNotDelete
/* compiled from: PG */
public class CustomPreferenceCategory extends PreferenceCategory {

    /* renamed from: I */
    private int f194989I;

    /* renamed from: J */
    private String f194990J;

    /* renamed from: K */
    private int f194991K;

    /* renamed from: L */
    private int f194992L;

    /* renamed from: M */
    private int f194993M;

    /* renamed from: N */
    private int f194994N;

    /* renamed from: O */
    private int f194995O;

    /* renamed from: P */
    private boolean f194996P = false;

    /* renamed from: Q */
    private boolean f194997Q = false;

    /* renamed from: R */
    private boolean f194998R = false;

    /* renamed from: S */
    private Boolean f194999S;

    /* renamed from: e */
    public int f195000e;

    /* renamed from: f */
    public int f195001f;

    /* renamed from: g */
    public boolean f195002g = false;

    /* renamed from: h */
    public boolean f195003h = false;

    /* renamed from: i */
    public Boolean f195004i;

    public CustomPreferenceCategory(Context context) {
        super(context);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory.a(androidx.preference.ax):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public void mo8313a(androidx.preference.C3998ax r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory.a(androidx.preference.ax):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory.mo8313a(androidx.preference.ax):void");
    }

    /* renamed from: ah */
    public final void mo65202ah(int i) {
        this.f194995O = i;
        this.f194998R = true;
    }

    /* renamed from: ai */
    public final void mo65203ai(int i) {
        this.f194989I = i;
        this.f194996P = true;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory.aj():void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: aj */
    public final void mo65204aj() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory.aj():void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.CustomPreferenceCategory.mo65204aj():void");
    }

    /* renamed from: ak */
    public final void mo65205ak(int i) {
        this.f194991K = R.dimen.assistant_settings_preference_category_padding;
        this.f194992L = i;
        this.f194993M = R.dimen.assistant_settings_preference_category_padding;
        this.f194994N = R.dimen.assistant_settings_preference_category_small_padding;
        this.f194997Q = true;
    }

    /* renamed from: al */
    public final void mo65206al() {
        this.f194990J = "sans-serif";
        mo8317e();
    }

    public CustomPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomPreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomPreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
