package com.google.android.libraries.onegoogle.owners.p2386a;

import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.people.C145651e;
import com.google.android.gms.people.internal.C145670g;
import com.google.android.gms.people.p10855b.C145643b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.onegoogle.owners.a.e */
/* compiled from: PG */
public final /* synthetic */ class C30946e implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C30946e f83384a = new C30946e();

    private /* synthetic */ C30946e() {
    }

    public final Object apply(Object obj) {
        int i = C30950i.f83388b;
        C145643b c = ((C145651e) obj).mo121706c();
        ArrayList arrayList = new ArrayList();
        C143864d dVar = new C143864d(c);
        while (dVar.hasNext()) {
            C145670g gVar = (C145670g) dVar.next();
            if (gVar.mo119333f()) {
                arrayList.add(((C30942a) C30951j.f83399a).apply(gVar));
            }
        }
        return C58485gu.m89842j(arrayList);
    }
}
