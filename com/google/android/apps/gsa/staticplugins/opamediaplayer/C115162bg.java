package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115164a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.bg */
/* compiled from: PG */
final class C115162bg {

    /* renamed from: a */
    public final Context f319610a;

    /* renamed from: b */
    public final C86124t f319611b;

    /* renamed from: c */
    public final C115164a f319612c;

    public C115162bg(Context context, C86124t tVar, C115169f fVar) {
        this.f319610a = context;
        this.f319611b = tVar;
        this.f319612c = (C115164a) fVar.toBuilder();
    }

    /* renamed from: c */
    public static ArrayList m190908c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58833ax mo101868a(int i) {
        if (i >= 0) {
            C52176ia iaVar = ((C115169f) this.f319612c.instance).f319628b;
            if (iaVar == null) {
                iaVar = C52176ia.f136911k;
            }
            if (i < iaVar.f136914b.size()) {
                C52176ia iaVar2 = ((C115169f) this.f319612c.instance).f319628b;
                if (iaVar2 == null) {
                    iaVar2 = C52176ia.f136911k;
                }
                return C58833ax.m90834k((C52174hz) iaVar2.f136914b.get(i));
            }
        }
        return C58836b.f156633a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58833ax mo101869b(int i) {
        return mo101868a(i).mo56106b(new C115160be(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo101870d(int i) {
        if (i < 0) {
            return false;
        }
        C52176ia iaVar = ((C115169f) this.f319612c.instance).f319628b;
        if (iaVar == null) {
            iaVar = C52176ia.f136911k;
        }
        return i < iaVar.f136914b.size();
    }
}
