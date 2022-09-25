package com.google.android.gms.car;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;

/* renamed from: com.google.android.gms.car.dg */
/* compiled from: PG */
public final class C143180dg extends ContextWrapper {

    /* renamed from: a */
    private Context f388279a;

    /* renamed from: b */
    private final Context f388280b;

    public C143180dg(Context context) {
        super(context);
        this.f388279a = context;
        this.f388280b = context;
    }

    /* renamed from: a */
    public final synchronized void mo118170a(Configuration configuration, DisplayMetrics displayMetrics) {
        Configuration configuration2 = new Configuration(this.f388279a.getResources().getConfiguration());
        configuration2.updateFrom(configuration);
        Resources.Theme theme = this.f388279a.getTheme();
        Context createConfigurationContext = this.f388279a.createConfigurationContext(configuration2);
        this.f388279a = createConfigurationContext;
        createConfigurationContext.getTheme().setTo(theme);
        this.f388279a.getResources().updateConfiguration(configuration2, displayMetrics);
        this.f388280b.getResources().updateConfiguration(configuration, displayMetrics);
    }

    public final synchronized Context createConfigurationContext(Configuration configuration) {
        return this.f388279a.createConfigurationContext(configuration);
    }

    public final synchronized Context createDisplayContext(Display display) {
        return this.f388279a.createDisplayContext(display);
    }

    public final synchronized Resources getResources() {
        return this.f388279a.getResources();
    }

    public final synchronized Resources.Theme getTheme() {
        return this.f388279a.getTheme();
    }

    public final synchronized void setTheme(int i) {
        super.setTheme(i);
        this.f388279a.setTheme(i);
    }
}
