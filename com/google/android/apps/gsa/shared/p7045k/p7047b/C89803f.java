package com.google.android.apps.gsa.shared.p7045k.p7047b;

import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.k.b.f */
/* compiled from: PG */
public final /* synthetic */ class C89803f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C89805h f243081a;

    /* renamed from: b */
    public final /* synthetic */ C89806i f243082b;

    public /* synthetic */ C89803f(C89805h hVar, C89806i iVar) {
        this.f243081a = hVar;
        this.f243082b = iVar;
    }

    public final C60870cx apply(Object obj) {
        C89805h hVar = this.f243081a;
        byte[] bArr = (byte[]) obj;
        Map map = this.f243082b.f243092e;
        if (map != null) {
            return C89057m.m144852d(C60856cj.m92900i(new C89021as(new C89022at(200, "unknown", C89022at.m144767b(map), (List) null), C89009ag.m144715a(ByteBuffer.wrap(bArr), hVar.f243085b))));
        }
        ((C59052c) ((C59052c) C89805h.f243084a.mo56225c()).mo56372aa(10565)).mo56386p("Should not happen: exception should be already thrown for null header fields");
        return C60856cj.m92900i(new C89057m(C89805h.m146195b("Null response header")));
    }
}
