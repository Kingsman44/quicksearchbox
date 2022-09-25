package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import com.google.android.apps.search.googleapp.collections.p10142a.C133492a;
import com.google.android.apps.search.googleapp.collections.p10142a.C133493b;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.q */
/* compiled from: PG */
public final /* synthetic */ class C139816q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139821v f380028a;

    /* renamed from: b */
    public final /* synthetic */ String f380029b;

    public /* synthetic */ C139816q(C139821v vVar, String str) {
        this.f380028a = vVar;
        this.f380029b = str;
    }

    public final Object apply(Object obj) {
        C139821v vVar = this.f380028a;
        String str = this.f380029b;
        int i = C139820u.f380042a;
        if (((Boolean) obj).booleanValue()) {
            ((C139799a) vVar).f379964e = 4;
            Intent intent = new Intent();
            C136128i l = C136129j.m221208l();
            l.mo112776k(C139779t.COLLECTIONS);
            C133492a aVar = (C133492a) C133493b.f363732c.createBuilder();
            aVar.copyOnWrite();
            C133493b bVar = (C133493b) aVar.instance;
            str.getClass();
            bVar.f363734a |= 1;
            bVar.f363735b = str;
            l.mo112768c(Optional.m71637of((C133493b) aVar.build()));
            C136127h.m221196a(intent, l.mo112766a());
            vVar.mo115290j(intent);
        } else {
            C139799a aVar2 = (C139799a) vVar;
            aVar2.f379964e = 5;
            vVar.mo115290j((Intent) null);
            if (str != null) {
                aVar2.f379961b = str;
            } else {
                throw new NullPointerException("Null agsaClassicCollectionsUrlPathSuffix");
            }
        }
        return vVar.mo115270a();
    }
}
