package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116819jn;
import com.google.common.p4525e.C58967o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.regex.Matcher;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.h.h */
/* compiled from: PG */
final class C116509h extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ String f323046a;

    /* renamed from: b */
    final /* synthetic */ C116510i f323047b;

    public C116509h(C116510i iVar, String str) {
        this.f323047b = iVar;
        this.f323046a = str;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2 = this.f323046a;
        if (intent == null) {
            str = "null";
        } else {
            str = C58967o.f156822c.mo56216a(intent.toUri(1));
        }
        String replaceAll = C116510i.f323048a.matcher(str2).replaceAll(Matcher.quoteReplacement(str));
        C58976aa aaVar = C58975e.f156826a;
        C116819jn jnVar = this.f323047b.f323050b;
        jnVar.f324175k.mo78970l(jnVar.mo102956i(jnVar.f324151N), replaceAll);
    }
}
