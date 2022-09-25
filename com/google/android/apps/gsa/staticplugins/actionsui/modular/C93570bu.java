package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.app.FragmentManager;
import android.content.Context;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91612b;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91619h;
import com.google.apps.tiktok.inject.C47266f;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bu */
/* compiled from: PG */
public final class C93570bu {
    /* renamed from: a */
    protected static C91612b m154337a(String str, C93545aw awVar, Context context, C91619h hVar) {
        FragmentManager c = awVar.mo87959c();
        C91612b bVar = (C91612b) c.findFragmentByTag(str);
        if (bVar == null) {
            bVar = new C91612b();
            if (hVar != null) {
                bVar.f255528a = hVar;
                bVar.f255529b = bVar.f255528a.mo86002a(context);
            } else {
                ((C91612b.C91613a) C47266f.m84076a(context, C91612b.C91613a.class)).mo85994qn(bVar);
                bVar.f255529b = bVar.f255528a.mo86002a(context);
            }
            c.beginTransaction().add(bVar, str).commit();
        }
        return bVar;
    }
}
