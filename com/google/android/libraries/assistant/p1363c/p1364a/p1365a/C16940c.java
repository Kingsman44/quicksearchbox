package com.google.android.libraries.assistant.p1363c.p1364a.p1365a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1367b.C16939a;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.a.a.c */
/* compiled from: PG */
public abstract class C16940c {
    /* renamed from: o */
    public static C16938b m33959o(Context context, int i, String str) {
        C16944g gVar = new C16944g();
        if (context != null) {
            gVar.f49493a = context;
            gVar.f49503k = i;
            gVar.f49494b = C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE;
            gVar.f49501i = (byte) (gVar.f49501i | 1);
            gVar.f49495c = "com.google.android.apps.gsa.plugins.podcastplayer.channel";
            gVar.f49496d = str;
            gVar.f49497e = new Bundle();
            gVar.f49502j = new C16932a();
            gVar.mo23112d(false);
            gVar.mo23111c();
            gVar.mo23110b(false);
            gVar.mo23113e(false);
            Optional empty = Optional.empty();
            if (empty != null) {
                gVar.f49499g = empty;
                gVar.mo23114f(C62948a.f169987b);
                Optional empty2 = Optional.empty();
                if (empty2 != null) {
                    gVar.f49500h = empty2;
                    return gVar;
                }
                throw new NullPointerException("Null notificationIcon");
            }
            throw new NullPointerException("Null notificationIntent");
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public abstract int mo23115a();

    /* renamed from: b */
    public abstract Context mo23116b();

    /* renamed from: c */
    public abstract Bundle mo23117c();

    /* renamed from: d */
    public abstract C16939a mo23118d();

    /* renamed from: e */
    public abstract C62910ar mo23119e();

    /* renamed from: f */
    public abstract Optional mo23120f();

    /* renamed from: g */
    public abstract Optional mo23121g();

    /* renamed from: h */
    public abstract String mo23122h();

    /* renamed from: i */
    public abstract String mo23123i();

    /* renamed from: j */
    public abstract boolean mo23124j();

    /* renamed from: k */
    public abstract boolean mo23125k();

    /* renamed from: l */
    public abstract boolean mo23126l();

    /* renamed from: m */
    public abstract boolean mo23127m();

    /* renamed from: n */
    public abstract C16932a mo23128n();

    /* renamed from: p */
    public abstract int mo23129p();
}
