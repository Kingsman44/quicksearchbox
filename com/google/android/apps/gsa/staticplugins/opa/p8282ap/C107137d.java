package com.google.android.apps.gsa.staticplugins.opa.p8282ap;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108247br;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108248bs;
import com.google.assistant.p3897e.p3917i.p3918a.C51456ij;
import com.google.assistant.p3897e.p3921j.C52223ju;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ap.d */
/* compiled from: PG */
public final /* synthetic */ class C107137d implements C108247br {

    /* renamed from: a */
    public final /* synthetic */ C107144k f298214a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f298215b;

    public /* synthetic */ C107137d(C107144k kVar, C58833ax axVar) {
        this.f298214a = kVar;
        this.f298215b = axVar;
    }

    /* renamed from: a */
    public final void mo95794a() {
        String str;
        C107144k kVar = this.f298214a;
        C58833ax axVar = this.f298215b;
        Intent intent = new Intent();
        intent.setType("image/*");
        if (axVar.mo56113h()) {
            String str2 = ((C51456ij) axVar.mo56107c()).f134040b;
            intent.setAction("com.google.assistant.SHARE_IMAGES");
            intent.setPackage(C87566i.m142234I(kVar.f298223b.getIntent().getExtras()));
            intent.putExtra("com.google.assistant.requestid", str2);
        }
        if (axVar.mo56113h()) {
            if (kVar.f298226e.resolveActivity(intent, 0) != null) {
                ArrayList arrayList = new ArrayList();
                C58485gu j = C58485gu.m89842j(kVar.f298232k.f298206a);
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    C52223ju juVar = (C52223ju) j.get(i);
                    try {
                        if ((juVar.f137040a & 16) != 0) {
                            str = juVar.f137045f;
                        } else {
                            str = juVar.f137041b;
                        }
                        arrayList.add(Uri.parse(str));
                    } catch (Exception e) {
                        ((C59052c) ((C59052c) ((C59052c) C107144k.f298222a.mo56225c()).mo56382g(e)).mo56372aa(25341)).mo56386p("Unable to parse the url");
                    }
                }
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                kVar.f298223b.startActivity(intent);
                C107144k.m177872i(C108248bs.SEND_PHOTOS_TO);
            }
        }
        kVar.f298225d.mo28211k(kVar.f298228g.mo95814i((List) Collection.EL.stream(C58485gu.m89842j(kVar.f298232k.f298206a)).map(C107140g.f298218a).collect(Collectors.toList()), kVar.f298233l), "Download photos", new C107143j(kVar));
        C107144k.m177872i(C108248bs.SEND_PHOTOS_TO);
    }
}
