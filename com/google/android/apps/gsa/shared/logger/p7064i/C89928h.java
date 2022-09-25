package com.google.android.apps.gsa.shared.logger.p7064i;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.gsa.shared.logger.i.h */
/* compiled from: PG */
final class C89928h {

    /* renamed from: a */
    public static final C59071e f246370a = C59071e.m91332i("com.google.android.apps.gsa.shared.logger.i.h");

    /* renamed from: b */
    public final EnumSet f246371b = EnumSet.noneOf(C89927g.class);

    /* renamed from: c */
    public boolean f246372c;

    /* renamed from: d */
    public C58833ax f246373d;

    /* renamed from: e */
    public C58833ax f246374e;

    /* renamed from: f */
    public C58833ax f246375f;

    /* renamed from: g */
    public C58833ax f246376g;

    /* renamed from: h */
    public C58833ax f246377h;

    /* renamed from: i */
    public C58833ax f246378i;

    public C89928h() {
        C58836b bVar = C58836b.f156633a;
        this.f246373d = bVar;
        this.f246374e = bVar;
        this.f246375f = bVar;
        this.f246376g = bVar;
        this.f246377h = bVar;
        this.f246378i = bVar;
    }

    /* renamed from: a */
    public final boolean mo83766a() {
        return this.f246371b.contains(C89927g.ACTIVITY_ON_CREATE_RECORDED);
    }

    /* renamed from: b */
    public final boolean mo83767b() {
        return this.f246371b.contains(C89927g.FIRST_DRAW_DONE_RECORDED);
    }

    /* renamed from: c */
    public final boolean mo83768c() {
        return this.f246371b.contains(C89927g.APPLICATION_INTERACTIVE_RECORDED) || this.f246371b.contains(C89927g.CANCEL_OR_FAIL_RECORDED);
    }
}
