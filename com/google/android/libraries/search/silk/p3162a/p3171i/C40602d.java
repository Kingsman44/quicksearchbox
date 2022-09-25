package com.google.android.libraries.search.silk.p3162a.p3171i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.silk.a.i.d */
/* compiled from: PG */
final class C40602d extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ int f106559a;

    /* renamed from: b */
    final /* synthetic */ C2164c f106560b;

    /* renamed from: c */
    final /* synthetic */ C40603e f106561c;

    public C40602d(C40603e eVar, int i, C2164c cVar) {
        this.f106561c = eVar;
        this.f106559a = i;
        this.f106560b = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        ((C59052c) ((C59052c) C40603e.f106562a.mo56224b()).mo56372aa(53365)).mo56386p("#onReceive");
        if (intent != null && intent.getIntExtra("com.google.android.libraries.search.silk.impl.homescreenshortcuts.RESULT_CODE_EXTRA", -1) == this.f106559a) {
            ((C59052c) ((C59052c) C40603e.f106562a.mo56224b()).mo56372aa(53366)).mo56386p("Installing shortcut completed");
            this.f106560b.mo5437b((Object) null);
            this.f106561c.mo42543b(this);
        }
    }
}
