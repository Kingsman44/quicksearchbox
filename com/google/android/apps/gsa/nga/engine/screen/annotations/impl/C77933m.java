package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.nga.d.a.a;
import com.google.android.apps.gsa.nga.d.a.ab;
import com.google.android.apps.gsa.nga.d.a.ac;
import com.google.android.apps.gsa.nga.d.a.b;
import com.google.android.apps.gsa.nga.d.a.c;
import com.google.android.apps.gsa.nga.d.a.d;
import com.google.android.apps.gsa.nga.d.a.x;
import com.google.android.apps.gsa.nga.d.a.y;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60812at;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Instant;
import p3186j$.time.ZoneId;
import p3186j$.time.temporal.ChronoField;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.m */
/* compiled from: PG */
public final /* synthetic */ class C77933m implements C60804al {

    /* renamed from: a */
    public final /* synthetic */ ScreenAnnotationEngineImpl f214672a;

    /* renamed from: b */
    public final /* synthetic */ C9418h f214673b;

    public /* synthetic */ C77933m(ScreenAnnotationEngineImpl screenAnnotationEngineImpl, C9418h hVar) {
        this.f214672a = screenAnnotationEngineImpl;
        this.f214673b = hVar;
    }

    /* renamed from: a */
    public final Object mo20085a(C60812at atVar, Object obj) {
        Optional optional;
        ScreenAnnotationEngineImpl screenAnnotationEngineImpl = this.f214672a;
        C9418h hVar = this.f214673b;
        C77939s sVar = (C77939s) obj;
        if (sVar == null) {
            return null;
        }
        C77944x xVar = screenAnnotationEngineImpl.f214635g;
        x createBuilder = y.c.createBuilder();
        createBuilder.copyOnWrite();
        hVar.getClass();
        createBuilder.instance.a = hVar;
        Instant a = xVar.f214685b.mo57444a();
        a createBuilder2 = b.f.createBuilder();
        DisplayManager displayManager = (DisplayManager) xVar.f214684a.getSystemService(DisplayManager.class);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (displayManager != null) {
            displayManager.getDisplay(0).getRealMetrics(displayMetrics);
        }
        c createBuilder3 = d.d.createBuilder();
        int i = displayMetrics.widthPixels;
        createBuilder3.copyOnWrite();
        createBuilder3.instance.a = i;
        int i2 = displayMetrics.heightPixels;
        createBuilder3.copyOnWrite();
        createBuilder3.instance.b = i2;
        int i3 = displayMetrics.densityDpi;
        createBuilder3.copyOnWrite();
        createBuilder3.instance.c = i3;
        d build = createBuilder3.build();
        createBuilder2.copyOnWrite();
        build.getClass();
        createBuilder2.instance.d = build;
        createBuilder2.copyOnWrite();
        createBuilder2.instance.a = "en";
        long micros = TimeUnit.SECONDS.toMicros(a.getEpochSecond());
        int i4 = a.get(ChronoField.MICRO_OF_SECOND);
        createBuilder2.copyOnWrite();
        createBuilder2.instance.b = micros + ((long) i4);
        String id = ZoneId.systemDefault().getId();
        createBuilder2.copyOnWrite();
        id.getClass();
        createBuilder2.instance.c = id;
        ab createBuilder4 = ac.c.createBuilder();
        Optional m = xVar.f214686c.mo72947m();
        Optional l = xVar.f214686c.mo72946l();
        if (!m.isEmpty() || !l.isEmpty()) {
            Objects.requireNonNull(createBuilder4);
            m.ifPresent(new C77941u(createBuilder4));
            Objects.requireNonNull(createBuilder4);
            l.ifPresent(new C77942v(createBuilder4));
            optional = Optional.m71637of(createBuilder4.build());
        } else {
            optional = Optional.empty();
        }
        optional.ifPresent(new C77943w(createBuilder2));
        b build2 = createBuilder2.build();
        createBuilder.copyOnWrite();
        build2.getClass();
        createBuilder.instance.b = build2;
        C77938r a2 = sVar.mo72904a();
        a2.mo72901b(createBuilder.build());
        return a2.mo72900a();
    }
}
