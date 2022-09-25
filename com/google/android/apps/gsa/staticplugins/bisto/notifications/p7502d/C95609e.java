package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90409p;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.e */
/* compiled from: PG */
public final class C95609e {

    /* renamed from: a */
    public final C95598as f267570a;

    /* renamed from: b */
    private final Context f267571b;

    /* renamed from: c */
    private final C89656k f267572c;

    /* renamed from: d */
    private final C21370a f267573d;

    /* renamed from: e */
    private final C95626v f267574e;

    /* renamed from: f */
    private final C68214a f267575f;

    public C95609e(Context context, C89656k kVar, C21370a aVar, C95598as asVar, C95626v vVar, C68214a aVar2) {
        this.f267571b = context;
        this.f267572c = kVar;
        this.f267573d = aVar;
        this.f267570a = asVar;
        this.f267574e = vVar;
        this.f267575f = aVar2;
    }

    /* renamed from: a */
    public final List mo89562a(List list, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        Context context = this.f267571b;
        C89656k kVar = this.f267572c;
        return C90409p.m147040a(context, kVar, this.f267573d, this.f267574e, list, (List) null, (List) null, false, (List) null, z, this.f267575f, kVar.mo83553h("enable_message_style_parser_for_whatsapp"), this.f267572c.mo83552g("enable_message_style_parser_for_messages_and_hangouts"), this.f267572c.mo83552g("enable_message_style_parser_for_facebook_messenger"), false, false, true, 0, false, (List) null);
    }
}
