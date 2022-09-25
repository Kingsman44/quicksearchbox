package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import android.net.Uri;
import android.support.p031v4.media.MediaBrowserCompat;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.m */
/* compiled from: PG */
public final /* synthetic */ class C18739m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18742p f52838a;

    public /* synthetic */ C18739m(C18742p pVar) {
        this.f52838a = pVar;
    }

    public final C60870cx apply(Object obj) {
        C18742p pVar = this.f52838a;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C123728av.f341753l);
        }
        C18912aa aaVar = pVar.f52845d;
        C18913ab abVar = (C18913ab) axVar.mo56107c();
        Iterator it = abVar.mo24150g().iterator();
        HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            Uri uri = ((MediaBrowserCompat.MediaItem) it.next()).f930b.f937f;
            if (uri == null || C58837ba.m90859h(uri.toString()) || hashSet.contains(uri.toString())) {
                it.remove();
            } else {
                hashSet.add(uri.toString());
            }
        }
        return aaVar.mo24220b(abVar, 3);
    }
}
