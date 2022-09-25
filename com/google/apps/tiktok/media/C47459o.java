package com.google.apps.tiktok.media;

import android.app.Activity;
import android.support.p031v4.app.Fragment;
import com.google.common.base.C58838bb;
import dagger.p5294a.C68220f;

/* renamed from: com.google.apps.tiktok.media.o */
/* compiled from: PG */
public final class C47459o implements C68220f {
    /* renamed from: a */
    public static C47449e m84432a(Object obj, Fragment fragment, Object obj2) {
        C47451g gVar = (C47451g) obj2;
        Object host = fragment.getHost();
        C58838bb.m90867b(host, "Fragment %s was not attached to a host", fragment);
        if (host instanceof Activity) {
            return new C47449e(new C47457m((C47458n) obj, new C47454j(fragment)), new ImageManager$FragmentImageManagerDelegate(fragment, gVar), true);
        }
        return new C47449e(new C47457m((C47458n) obj, new C47455k(fragment)), new ImageManager$FragmentNoActivityImageManagerDelegate(fragment), true);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
