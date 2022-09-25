package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.nga.api.a.m;
import com.google.android.apps.gsa.nga.engine.dictation.ae;
import com.google.android.apps.gsa.nga.engine.dictation.ag;
import com.google.android.apps.gsa.nga.engine.dictation.w;
import com.google.android.apps.gsa.nga.engine.dictation.y;
import com.google.android.apps.gsa.nga.engine.dictation.z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125932u;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p4946az.C64353a;
import com.google.protos.p4946az.C64354b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.z */
/* compiled from: PG */
public final /* synthetic */ class C125520z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C125470af f346117a;

    /* renamed from: b */
    public final /* synthetic */ ae f346118b;

    /* renamed from: c */
    public final /* synthetic */ m f346119c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f346120d;

    /* renamed from: e */
    public final /* synthetic */ String f346121e;

    /* renamed from: f */
    public final /* synthetic */ int f346122f;

    public /* synthetic */ C125520z(C125470af afVar, ae aeVar, m mVar, int i, C58485gu guVar, String str) {
        this.f346117a = afVar;
        this.f346118b = aeVar;
        this.f346119c = mVar;
        this.f346122f = i;
        this.f346120d = guVar;
        this.f346121e = str;
    }

    public final Object apply(Object obj) {
        y yVar;
        C125470af afVar = this.f346117a;
        ae aeVar = this.f346118b;
        m mVar = this.f346119c;
        int i = this.f346122f;
        C125472ah ahVar = (C125472ah) obj;
        C125516v vVar = new C125516v(this.f346120d, this.f346121e);
        af afVar2 = afVar.f346007e.a;
        if (afVar2 == null) {
            afVar2 = af.w;
        }
        boolean z = !m.b.equals(mVar);
        int i2 = afVar2.d;
        boolean z2 = i == 2;
        boolean equals = mVar.equals(m.e);
        w createBuilder = y.l.createBuilder();
        boolean z3 = C125470af.f346004b.d;
        createBuilder.copyOnWrite();
        createBuilder.instance.d = z3;
        int i3 = C125470af.f346004b.j;
        createBuilder.copyOnWrite();
        createBuilder.instance.j = i3;
        createBuilder.copyOnWrite();
        createBuilder.instance.g = !equals;
        createBuilder.copyOnWrite();
        createBuilder.instance.h = z2;
        createBuilder.copyOnWrite();
        createBuilder.instance.k = 3;
        if (C125932u.m205971c(i2)) {
            boolean z4 = afVar.f346009g;
            createBuilder.copyOnWrite();
            createBuilder.instance.f = z4;
            yVar = (y) createBuilder.build();
        } else if (C125932u.m205972d(i2)) {
            boolean z5 = C125470af.f346004b.a && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.a = z5;
            boolean z6 = C125470af.f346004b.b && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.b = z6;
            boolean z7 = C125470af.f346004b.i;
            createBuilder.copyOnWrite();
            createBuilder.instance.i = z7;
            yVar = (y) createBuilder.build();
        } else if (!TextUtils.equals(afVar2.e, "com.google.android.gm") || !C125932u.m205974f(i2)) {
            boolean z8 = C125470af.f346004b.c && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.c = z8;
            boolean z9 = C125470af.f346004b.i;
            createBuilder.copyOnWrite();
            createBuilder.instance.i = z9;
            yVar = (y) createBuilder.build();
        } else {
            boolean z10 = afVar.f346010h && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.e = z10;
            boolean z11 = C125470af.f346004b.c && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.c = z11;
            boolean z12 = C125470af.f346004b.a && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.a = z12;
            boolean z13 = C125470af.f346004b.b && z;
            createBuilder.copyOnWrite();
            createBuilder.instance.b = z13;
            boolean z14 = C125470af.f346004b.i;
            createBuilder.copyOnWrite();
            createBuilder.instance.i = z14;
            yVar = (y) createBuilder.build();
        }
        ag a = ahVar.mo106978a(aeVar, yVar);
        z zVar = z.a;
        z a2 = z.a(a.g);
        if (a2 == null) {
            a2 = z.g;
        }
        int ordinal = a2.ordinal();
        if (!(ordinal == 1 || ordinal == 4)) {
            C59052c cVar = (C59052c) ((C59052c) C125470af.f346003a.mo56226d()).mo56372aa(36588);
            z a3 = z.a(a.g);
            if (a3 == null) {
                a3 = z.g;
            }
            C69664n.m101061g(a3, "<this>");
            cVar.mo56389s("Formatting failed (status code %s). Falling back. [SD]", C126290c.m206496a(Integer.valueOf(a3.getNumber())));
        }
        z a4 = z.a(a.g);
        if (a4 == null) {
            a4 = z.g;
        }
        if (!a4.equals(z.b)) {
            return (ag) vVar.get();
        }
        if (yVar.c || i == 2) {
            return a;
        }
        com.google.android.apps.gsa.nga.engine.dictation.af builder = a.toBuilder();
        String str = a.a;
        String str2 = a.c;
        builder.copyOnWrite();
        builder.instance.a = String.valueOf(str).concat(String.valueOf(str2));
        builder.copyOnWrite();
        builder.instance.c = BuildConfig.FLAVOR;
        C64354b bVar = a.b;
        if (bVar == null) {
            bVar = C64354b.f173954b;
        }
        C64353a aVar = (C64353a) bVar.toBuilder();
        C64354b bVar2 = a.d;
        if (bVar2 == null) {
            bVar2 = C64354b.f173954b;
        }
        C62971cq cqVar = bVar2.f173956a;
        aVar.copyOnWrite();
        C64354b bVar3 = (C64354b) aVar.instance;
        bVar3.mo59274a();
        C62947c.addAll((Iterable) cqVar, (List) bVar3.f173956a);
        builder.copyOnWrite();
        C64354b bVar4 = (C64354b) aVar.build();
        bVar4.getClass();
        builder.instance.b = bVar4;
        C64354b bVar5 = C64354b.f173954b;
        builder.copyOnWrite();
        bVar5.getClass();
        builder.instance.d = bVar5;
        builder.copyOnWrite();
        builder.instance.e = C62942bv.emptyProtobufList();
        return builder.build();
    }
}
