package com.google.android.apps.search.fedora.p10104h;

import com.google.android.apps.search.fedora.p10099e.C132769a;
import com.google.android.apps.search.fedora.p10099e.C132796d;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132803k;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;
import java.io.File;

/* renamed from: com.google.android.apps.search.fedora.h.o */
/* compiled from: PG */
public final /* synthetic */ class C132906o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ File f362549a;

    /* renamed from: b */
    public final /* synthetic */ C132798f f362550b;

    public /* synthetic */ C132906o(File file, C132798f fVar) {
        this.f362549a = file;
        this.f362550b = fVar;
    }

    public final Object apply(Object obj) {
        File file = this.f362549a;
        C132798f fVar = this.f362550b;
        C132804l lVar = (C132804l) obj;
        String str = lVar.f362342b;
        C132798f fVar2 = C132798f.f362315o;
        str.getClass();
        C62995dn dnVar = lVar.f362343c;
        if (dnVar.containsKey(str)) {
            fVar2 = (C132798f) dnVar.get(str);
        }
        C132797e eVar = fVar2.f362325i;
        if (eVar == null) {
            eVar = C132797e.f362307g;
        }
        C132796d dVar = (C132796d) eVar.toBuilder();
        String absolutePath = file.getAbsolutePath();
        dVar.copyOnWrite();
        C132797e eVar2 = (C132797e) dVar.instance;
        absolutePath.getClass();
        eVar2.f362309a |= 8;
        eVar2.f362313e = absolutePath;
        C132797e eVar3 = fVar.f362325i;
        if (eVar3 == null) {
            eVar3 = C132797e.f362307g;
        }
        int i = eVar3.f362311c;
        dVar.copyOnWrite();
        C132797e eVar4 = (C132797e) dVar.instance;
        eVar4.f362309a |= 16;
        eVar4.f362314f = i;
        C132797e eVar5 = (C132797e) dVar.build();
        C132798f fVar3 = C132798f.f362315o;
        str.getClass();
        C62995dn dnVar2 = lVar.f362343c;
        if (dnVar2.containsKey(str)) {
            fVar3 = (C132798f) dnVar2.get(str);
        }
        C132769a aVar = (C132769a) fVar3.toBuilder();
        aVar.copyOnWrite();
        C132798f fVar4 = (C132798f) aVar.instance;
        eVar5.getClass();
        fVar4.f362325i = eVar5;
        fVar4.f362317a |= 64;
        C132803k kVar = (C132803k) lVar.toBuilder();
        kVar.mo110907b(str, (C132798f) aVar.build());
        return (C132804l) kVar.build();
    }
}
