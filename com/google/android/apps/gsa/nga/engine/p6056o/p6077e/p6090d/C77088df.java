package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.app.assist.AssistContent;
import android.content.ComponentName;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.df */
/* compiled from: PG */
public abstract class C77088df implements C77140u {
    /* renamed from: k */
    public static C77087de m123740k() {
        C77129j jVar = new C77129j();
        jVar.mo72403e(false);
        return jVar;
    }

    /* renamed from: a */
    public abstract C74965n mo72405a();

    /* renamed from: b */
    public abstract C58485gu mo72406b();

    /* renamed from: c */
    public abstract Optional mo72407c();

    /* renamed from: d */
    public abstract Optional mo72408d();

    /* renamed from: e */
    public abstract Optional mo72409e();

    /* renamed from: f */
    public abstract Optional mo72410f();

    /* renamed from: g */
    public abstract boolean mo72411g();

    /* renamed from: h */
    public final C83320io mo72412h() {
        return mo72405a().mo71336k();
    }

    /* renamed from: i */
    public final C58485gu mo72413i() {
        return mo72405a().mo71331f().f209177a;
    }

    /* renamed from: j */
    public final Optional mo72414j() {
        ComponentName component;
        if (!mo72407c().isPresent() || (component = ((AssistContent) mo72407c().get()).getIntent().getComponent()) == null) {
            return mo72405a().mo71340o();
        }
        return Optional.m71637of(component.getPackageName());
    }
}
