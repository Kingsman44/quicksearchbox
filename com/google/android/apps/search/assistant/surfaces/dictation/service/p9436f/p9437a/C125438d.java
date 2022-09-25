package com.google.android.apps.search.assistant.surfaces.dictation.service.p9436f.p9437a;

import com.google.android.apps.gsa.unifiedime.C118601s;
import com.google.android.apps.gsa.unifiedime.C118604v;
import com.google.android.apps.gsa.unifiedime.C118605w;
import com.google.android.apps.gsa.unifiedime.C118606x;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125034a;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125064as;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125036b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125422z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126221bh;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9481b.C126319a;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.f.a.d */
/* compiled from: PG */
public final class C125438d implements C35472h {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f345927a = C59071e.m91331h();

    /* renamed from: b */
    private final C125034a f345928b;

    /* renamed from: c */
    private final C125422z f345929c;

    /* renamed from: d */
    private final C126221bh f345930d;

    public C125438d(C125422z zVar, C126221bh bhVar, C125034a aVar) {
        C69664n.m101061g(zVar, "dictationController");
        C69664n.m101061g(aVar, "triggerType");
        this.f345929c = zVar;
        this.f345930d = bhVar;
        this.f345928b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C125036b bVar = (C125036b) C126319a.m206551f(dyVar, "dictate_emoji_args", C125036b.f344969b.getParserForType());
        C118605w wVar = (C118605w) C118606x.f330892g.createBuilder();
        String str = bVar.f344971a;
        wVar.copyOnWrite();
        C118606x xVar = (C118606x) wVar.instance;
        str.getClass();
        xVar.f330894a |= 1;
        xVar.f330895b = str;
        wVar.copyOnWrite();
        C118606x xVar2 = (C118606x) wVar.instance;
        xVar2.f330894a |= 2;
        xVar2.f330896c = true;
        C118601s sVar = (C118601s) C118604v.f330885f.createBuilder();
        sVar.copyOnWrite();
        C118604v vVar = (C118604v) sVar.instance;
        vVar.f330887a |= 1;
        vVar.f330888b = 0;
        String str2 = bVar.f344971a;
        C69664n.m101060f(str2, "dictateEmojiArgs.text");
        int codePointCount = str2.codePointCount(0, bVar.f344971a.length());
        sVar.copyOnWrite();
        C118604v vVar2 = (C118604v) sVar.instance;
        vVar2.f330887a |= 2;
        vVar2.f330889c = codePointCount;
        C125034a aVar = this.f345928b;
        C125034a aVar2 = C125034a.TRIGGER_UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 1) {
            sVar.copyOnWrite();
            C118604v vVar3 = (C118604v) sVar.instance;
            vVar3.f330890d = 4;
            vVar3.f330887a = 4 | vVar3.f330887a;
        } else if (ordinal != 2) {
            C59052c cVar = (C59052c) f345927a.mo56226d();
            int number = this.f345928b.getNumber();
            cVar.mo56379ah(new C59094n(36557));
            cVar.mo56387q("Unsupported action trigger type: %s. [SD]", number);
        } else {
            sVar.copyOnWrite();
            C118604v vVar4 = (C118604v) sVar.instance;
            vVar4.f330890d = 6;
            vVar4.f330887a = 4 | vVar4.f330887a;
        }
        wVar.mo103784a(sVar);
        C69664n.m101060f(wVar, "newBuilder().apply {\n   …      }\n        )\n      }");
        C125064as asVar = (C125064as) C125065at.f345040b.createBuilder();
        C69664n.m101060f(asVar, "newBuilder()");
        asVar.mo106794b(wVar);
        this.f345930d.mo107463a((C125065at) asVar.build());
        this.f345929c.f345896a.mo106940c();
        return C60856cj.m92900i(C36180b.f94544a);
    }
}
