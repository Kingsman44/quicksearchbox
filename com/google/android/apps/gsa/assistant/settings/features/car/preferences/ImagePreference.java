package com.google.android.apps.gsa.assistant.settings.features.car.preferences;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ImagePreference extends Preference {

    /* renamed from: a */
    public String f193743a;

    /* renamed from: b */
    public Drawable f193744b;

    /* renamed from: c */
    private final int f193745c;

    public ImagePreference(Context context, int i) {
        super(context);
        this.f12718D = i == 2 ? R.layout.car_logo_preference : R.layout.car_image_preference;
        this.f193745c = i;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.car.preferences.ImagePreference.a(androidx.preference.ax):void, dex: classes4.dex
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
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.car.preferences.ImagePreference.a(androidx.preference.ax):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.car.preferences.ImagePreference.mo8313a(androidx.preference.ax):void");
    }
}
