package com.google.android.apps.gsa.staticplugins.p7756cx;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.shared.p7243l.C91757c;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.reminders.C145778g;
import com.google.android.gms.reminders.internal.p10862a.C145800s;
import com.google.android.libraries.p11024al.p11025a.C147749e;
import com.google.android.libraries.p11024al.p11025a.C147753i;
import com.google.android.libraries.p11024al.p11025a.C147756l;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.cx.f */
/* compiled from: PG */
public final /* synthetic */ class C99227f implements C91757c {

    /* renamed from: a */
    public final /* synthetic */ Collection f277593a;

    public /* synthetic */ C99227f(Collection collection) {
        this.f277593a = collection;
    }

    /* renamed from: a */
    public final Object mo86253a(C143851w wVar) {
        Collection<String> collection = this.f277593a;
        C143840l lVar = C145778g.f394144a;
        HashMap hashMap = new HashMap();
        for (String str : collection) {
            hashMap.put(str, C147753i.m240809d(wVar.mo119159d(new C145800s(wVar, C147756l.m240819a(str)))));
        }
        return Boolean.valueOf(((Collection) C90877ak.m148472f(C60856cj.m92892a(hashMap.values()).mo57334a(new C147749e(hashMap), C60826bg.f164896a))).isEmpty());
    }
}
