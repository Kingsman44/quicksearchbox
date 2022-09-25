package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e;

import android.app.assist.AssistContent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import com.google.android.apps.gsa.assist.C9386c;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.apps.gsa.assist.C9407e;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119880du;
import com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9074a.C120182b;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17258d;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.android.libraries.search.assistant.p2511d.C32561x;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32641bj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.function.Consumer;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.e.g */
/* compiled from: PG */
public final class C120306g implements C17266e {

    /* renamed from: a */
    private final C119880du f334726a;

    /* renamed from: b */
    private final C71422aw f334727b;

    /* renamed from: c */
    private final C59071e f334728c = C59071e.m91331h();

    /* renamed from: d */
    private final C32641bj f334729d;

    /* renamed from: e */
    private final C120182b f334730e;

    public C120306g(C32641bj bjVar, C120182b bVar, C119880du duVar, C71422aw awVar) {
        C69664n.m101061g(bVar, "accessSessionFetcher");
        C69664n.m101061g(duVar, "temporaryConfiguration");
        C69664n.m101061g(awVar, "executor");
        this.f334729d = bjVar;
        this.f334730e = bVar;
        this.f334726a = duVar;
        this.f334727b = awVar;
    }

    /* renamed from: d */
    private final void m199296d(Bundle bundle, AssistContent assistContent) {
        String string;
        C9407e eVar = (C9407e) C9410f.f32690f.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        if (!(bundle == null || (string = bundle.getString("android.intent.extra.ASSIST_PACKAGE")) == null)) {
            eVar.copyOnWrite();
            C9410f fVar = (C9410f) eVar.instance;
            fVar.f32692a |= 1;
            fVar.f32693b = string;
        }
        eVar.copyOnWrite();
        C9410f fVar2 = (C9410f) eVar.instance;
        fVar2.f32692a |= 4;
        fVar2.f32695d = 0;
        C9386c cVar = (C9386c) C9405d.f32673k.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        if (assistContent != null) {
            Intent intent = assistContent.getIntent();
            Uri webUri = assistContent.getWebUri();
            if (intent != null) {
                try {
                    String action = intent.getAction();
                    Uri data = intent.getData();
                    if (!(action == null || data == null)) {
                        String uri = new Intent(action, data).toUri(1);
                        cVar.copyOnWrite();
                        C9405d dVar = (C9405d) cVar.instance;
                        uri.getClass();
                        dVar.f32675a |= 4;
                        dVar.f32678d = uri;
                    }
                } catch (AndroidRuntimeException e) {
                    C59052c cVar2 = (C59052c) this.f334728c.mo56225c();
                    cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
                    C59052c cVar3 = (C59052c) cVar2.mo56382g(e);
                    cVar3.mo56379ah(new C59094n(34711));
                    cVar3.mo56386p("#createAppPackage: error accessing activityIntent.");
                }
            }
            if (webUri != null) {
                String uri2 = webUri.toString();
                cVar.copyOnWrite();
                C9405d dVar2 = (C9405d) cVar.instance;
                uri2.getClass();
                dVar2.f32675a |= 8;
                dVar2.f32679e = uri2;
            }
            boolean isAppProvidedIntent = assistContent.isAppProvidedIntent();
            cVar.copyOnWrite();
            C9405d dVar3 = (C9405d) cVar.instance;
            dVar3.f32675a |= 32;
            dVar3.f32681g = isAppProvidedIntent;
            boolean isAppProvidedWebUri = assistContent.isAppProvidedWebUri();
            cVar.copyOnWrite();
            C9405d dVar4 = (C9405d) cVar.instance;
            dVar4.f32675a |= 64;
            dVar4.f32682h = isAppProvidedWebUri;
            if (assistContent.getStructuredData() != null) {
                String structuredData = assistContent.getStructuredData();
                cVar.copyOnWrite();
                C9405d dVar5 = (C9405d) cVar.instance;
                structuredData.getClass();
                dVar5.f32675a |= 256;
                dVar5.f32684j = structuredData;
            }
        }
        eVar.mo17659b((C9405d) cVar.build());
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "builder.build()");
        C9410f fVar3 = (C9410f) build;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo23245a() {
        return C60856cj.m92900i(C17258d.f50035a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: com.google.android.libraries.search.assistant.f.a.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01d8, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e4, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01e8, code lost:
        throw r14;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:35:0x01d4, B:44:0x01e3] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=j$.util.function.Consumer, code=java.lang.Object, for r13v0, types: [j$.util.function.Consumer, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104721b(java.lang.Object r13, p5462h.p5466c.C69577g r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120301b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.assistant.platform.e.b.a.e.b r0 = (com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120301b) r0
            int r1 = r0.f334717g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f334717g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.e.b.a.e.b r0 = new com.google.android.apps.search.assistant.platform.e.b.a.e.b
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f334715e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f334717g
            r3 = 1
            java.lang.String r4 = "ConvEngine.OnlineProcessing"
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x005c
            if (r2 == r3) goto L_0x0043
            if (r2 != r5) goto L_0x003b
            java.lang.Object r13 = r0.f334714d
            com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult r13 = (com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult) r13
            java.lang.Object r1 = r0.f334713c
            java.lang.Object r2 = r0.f334712b
            java.lang.Object r0 = r0.f334711a
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0038 }
            goto L_0x00fa
        L_0x0038:
            r13 = move-exception
            goto L_0x01e3
        L_0x003b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0043:
            java.lang.Object r13 = r0.f334714d
            kotlinx.coroutines.be r13 = (kotlinx.coroutines.C71604be) r13
            java.lang.Object r2 = r0.f334713c
            java.lang.Object r3 = r0.f334712b
            java.lang.Object r7 = r0.f334711a
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0057 }
            r11 = r7
            r7 = r13
            r13 = r3
            r3 = r2
            r2 = r11
            goto L_0x00e2
        L_0x0057:
            r13 = move-exception
            r1 = r2
            r0 = r7
            goto L_0x01e3
        L_0x005c:
            p5462h.C69714l.m101134b(r14)
            com.google.common.f.e r14 = r12.f334728c     // Catch:{ all -> 0x01e9 }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ all -> 0x01e9 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x01e9 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e9 }
            r14.mo56378ag(r2, r4)     // Catch:{ all -> 0x01e9 }
            java.lang.String r2 = "#assistDataBuilder: running the assist data sender!"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x01e9 }
            r8 = 34712(0x8798, float:4.8642E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x01e9 }
            r14.mo56379ah(r7)     // Catch:{ all -> 0x01e9 }
            r14.mo56386p(r2)     // Catch:{ all -> 0x01e9 }
            com.google.android.apps.search.assistant.platform.e.b.a.a.b r14 = r12.f334730e     // Catch:{ all -> 0x01e9 }
            com.google.android.apps.search.assistant.platform.e.b.a.e.a r2 = com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120300a.f334709a     // Catch:{ all -> 0x01e9 }
            com.google.android.libraries.search.assistant.f.a.d r7 = r14.f334473a     // Catch:{ all -> 0x01e9 }
            java.lang.String r8 = "ASFetcher"
            com.google.android.libraries.search.assistant.f.a.d.cq r9 = r14.f334474b     // Catch:{ all -> 0x01e9 }
            com.google.android.libraries.search.assistant.f.a.b r2 = r7.mo38218a(r8, r9, r2)     // Catch:{ all -> 0x01e9 }
            com.google.android.libraries.search.assistant.h.a.c.a.g r14 = r14.f334475c     // Catch:{ all -> 0x01e9 }
            com.google.android.apps.search.assistant.platform.e.b.a.a.a r7 = new com.google.android.apps.search.assistant.platform.e.b.a.a.a     // Catch:{ all -> 0x01e9 }
            r7.<init>(r2)     // Catch:{ all -> 0x01e9 }
            r14.mo38849b(r7)     // Catch:{ all -> 0x01e9 }
            java.lang.String r14 = "accessSession"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r14)     // Catch:{ all -> 0x01e9 }
            com.google.android.libraries.search.assistant.f.a.b.bj r14 = r12.f334729d     // Catch:{ all -> 0x01e0 }
            com.google.android.libraries.search.assistant.f.a.b.bi r7 = new com.google.android.libraries.search.assistant.f.a.b.bi     // Catch:{ all -> 0x01e0 }
            g.a.a r8 = r14.f87488a     // Catch:{ all -> 0x01e0 }
            java.lang.Object r8 = r8.mo17428b()     // Catch:{ all -> 0x01e0 }
            com.google.android.libraries.search.assistant.invocation.assistdata.a.a r8 = (com.google.android.libraries.search.assistant.invocation.assistdata.p2595a.C33517a) r8     // Catch:{ all -> 0x01e0 }
            r8.getClass()     // Catch:{ all -> 0x01e0 }
            g.a.a r14 = r14.f87489b     // Catch:{ all -> 0x01e0 }
            java.lang.Object r14 = r14.mo17428b()     // Catch:{ all -> 0x01e0 }
            kotlinx.coroutines.aw r14 = (kotlinx.coroutines.C71422aw) r14     // Catch:{ all -> 0x01e0 }
            r14.getClass()     // Catch:{ all -> 0x01e0 }
            r2.getClass()     // Catch:{ all -> 0x01e0 }
            r7.<init>(r8, r14, r2)     // Catch:{ all -> 0x01e0 }
            kotlinx.coroutines.aw r14 = r12.f334727b     // Catch:{ all -> 0x01e0 }
            com.google.android.apps.search.assistant.platform.e.b.a.e.d r8 = new com.google.android.apps.search.assistant.platform.e.b.a.e.d     // Catch:{ all -> 0x01e0 }
            r8.<init>(r7, r6)     // Catch:{ all -> 0x01e0 }
            r9 = 3
            kotlinx.coroutines.be r14 = kotlinx.coroutines.C71803m.m105042c(r14, r6, r6, r8, r9)     // Catch:{ all -> 0x01e0 }
            kotlinx.coroutines.aw r8 = r12.f334727b     // Catch:{ all -> 0x01e0 }
            com.google.android.apps.search.assistant.platform.e.b.a.e.e r10 = new com.google.android.apps.search.assistant.platform.e.b.a.e.e     // Catch:{ all -> 0x01e0 }
            r10.<init>(r7, r6)     // Catch:{ all -> 0x01e0 }
            kotlinx.coroutines.be r7 = kotlinx.coroutines.C71803m.m105042c(r8, r6, r6, r10, r9)     // Catch:{ all -> 0x01e0 }
            r0.f334711a = r12     // Catch:{ all -> 0x01e0 }
            r0.f334712b = r13     // Catch:{ all -> 0x01e0 }
            r0.f334713c = r2     // Catch:{ all -> 0x01e0 }
            r0.f334714d = r7     // Catch:{ all -> 0x01e0 }
            r0.f334717g = r3     // Catch:{ all -> 0x01e0 }
            java.lang.Object r14 = r14.mo62825a(r0)     // Catch:{ all -> 0x01e0 }
            if (r14 == r1) goto L_0x01df
            r3 = r2
            r2 = r12
        L_0x00e2:
            com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult r14 = (com.google.android.libraries.search.assistant.invocation.assistdata.api.AssistStateResult) r14     // Catch:{ all -> 0x01db }
            r0.f334711a = r2     // Catch:{ all -> 0x01db }
            r0.f334712b = r13     // Catch:{ all -> 0x01db }
            r0.f334713c = r3     // Catch:{ all -> 0x01db }
            r0.f334714d = r14     // Catch:{ all -> 0x01db }
            r0.f334717g = r5     // Catch:{ all -> 0x01db }
            java.lang.Object r0 = r7.mo62825a(r0)     // Catch:{ all -> 0x01db }
            if (r0 == r1) goto L_0x01da
            r1 = r3
            r11 = r2
            r2 = r13
            r13 = r14
            r14 = r0
            r0 = r11
        L_0x00fa:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14     // Catch:{ all -> 0x0038 }
            android.os.Bundle r3 = r13.f89682a     // Catch:{ all -> 0x0038 }
            android.app.assist.AssistStructure r7 = r13.f89683b     // Catch:{ all -> 0x0038 }
            android.app.assist.AssistContent r7 = r13.f89684c     // Catch:{ all -> 0x0038 }
            r8 = r0
            com.google.android.apps.search.assistant.platform.e.b.a.e.g r8 = (com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120306g) r8     // Catch:{ all -> 0x0038 }
            r8.m199296d(r3, r7)     // Catch:{ all -> 0x0038 }
            android.os.Bundle r3 = r13.f89682a     // Catch:{ all -> 0x0038 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r3)     // Catch:{ all -> 0x0038 }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)     // Catch:{ all -> 0x0038 }
            android.app.assist.AssistContent r7 = r13.f89684c     // Catch:{ all -> 0x0038 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r7)     // Catch:{ all -> 0x0038 }
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)     // Catch:{ all -> 0x0038 }
            com.google.android.apps.search.assistant.platform.e.b.a.e.c r8 = new com.google.android.apps.search.assistant.platform.e.b.a.e.c     // Catch:{ all -> 0x0038 }
            r8.<init>(r13)     // Catch:{ all -> 0x0038 }
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ all -> 0x0038 }
            j$.util.Optional r14 = p3186j$.util.Optional.m71637of(r14)     // Catch:{ all -> 0x0038 }
            j$.util.Optional r8 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0038 }
            com.google.android.apps.gsa.assist.h r13 = com.google.android.libraries.search.assistant.p2510c.C32506b.m60316b(r3, r7, r13, r14, r8)     // Catch:{ all -> 0x0038 }
            com.google.knowledge.b.k r14 = com.google.knowledge.p4671b.C61818k.f166999r     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ all -> 0x0038 }
            com.google.knowledge.b.j r14 = (com.google.knowledge.p4671b.C61817j) r14     // Catch:{ all -> 0x0038 }
            r14.copyOnWrite()     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r3 = r14.instance     // Catch:{ all -> 0x0038 }
            com.google.knowledge.b.k r3 = (com.google.knowledge.p4671b.C61818k) r3     // Catch:{ all -> 0x0038 }
            r13.getClass()     // Catch:{ all -> 0x0038 }
            r3.f167012l = r13     // Catch:{ all -> 0x0038 }
            int r13 = r3.f167001a     // Catch:{ all -> 0x0038 }
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r3.f167001a = r13     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r13 = r14.build()     // Catch:{ all -> 0x0038 }
            java.lang.String r14 = "newBuilder().setAssistDa…(assistDataProto).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x0038 }
            com.google.knowledge.b.k r13 = (com.google.knowledge.p4671b.C61818k) r13     // Catch:{ all -> 0x0038 }
            com.google.assistant.e.e.a.d r14 = com.google.assistant.p3897e.p3910e.p3911a.C51189d.f133247h     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ all -> 0x0038 }
            com.google.assistant.e.e.a.c r14 = (com.google.assistant.p3897e.p3910e.p3911a.C51188c) r14     // Catch:{ all -> 0x0038 }
            com.google.at.h.b.a.e r3 = com.google.p4017at.p4060h.p4068b.p4069a.C54188e.f142203f     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x0038 }
            com.google.at.h.b.a.b r3 = (com.google.p4017at.p4060h.p4068b.p4069a.C54185b) r3     // Catch:{ all -> 0x0038 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ all -> 0x0038 }
            com.google.at.h.b.a.e r7 = (com.google.p4017at.p4060h.p4068b.p4069a.C54188e) r7     // Catch:{ all -> 0x0038 }
            r13.getClass()     // Catch:{ all -> 0x0038 }
            r7.f142207c = r13     // Catch:{ all -> 0x0038 }
            int r13 = r7.f142205a     // Catch:{ all -> 0x0038 }
            r13 = r13 | r5
            r7.f142205a = r13     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r13 = r3.build()     // Catch:{ all -> 0x0038 }
            com.google.at.h.b.a.e r13 = (com.google.p4017at.p4060h.p4068b.p4069a.C54188e) r13     // Catch:{ all -> 0x0038 }
            r14.copyOnWrite()     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r3 = r14.instance     // Catch:{ all -> 0x0038 }
            com.google.assistant.e.e.a.d r3 = (com.google.assistant.p3897e.p3910e.p3911a.C51189d) r3     // Catch:{ all -> 0x0038 }
            r13.getClass()     // Catch:{ all -> 0x0038 }
            r3.f133251c = r13     // Catch:{ all -> 0x0038 }
            int r13 = r3.f133249a     // Catch:{ all -> 0x0038 }
            r13 = r13 | r5
            r3.f133249a = r13     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r13 = r14.build()     // Catch:{ all -> 0x0038 }
            java.lang.String r14 = "newBuilder()\n           …   )\n            .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x0038 }
            com.google.assistant.e.e.a.d r13 = (com.google.assistant.p3897e.p3910e.p3911a.C51189d) r13     // Catch:{ all -> 0x0038 }
            com.google.speech.h.ce r14 = com.google.speech.p5208h.C66607ce.f181191f     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ all -> 0x0038 }
            com.google.speech.h.cd r14 = (com.google.speech.p5208h.C66606cd) r14     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bt r3 = com.google.speech.p5208h.C66629d.f181274a     // Catch:{ all -> 0x0038 }
            r14.mo58885m(r3, r13)     // Catch:{ all -> 0x0038 }
            com.google.protobuf.bv r13 = r14.build()     // Catch:{ all -> 0x0038 }
            java.lang.String r14 = "newBuilder()\n           …est)\n            .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)     // Catch:{ all -> 0x0038 }
            com.google.speech.h.ce r13 = (com.google.speech.p5208h.C66607ce) r13     // Catch:{ all -> 0x0038 }
            com.google.android.libraries.assistant.c.e.a.c.p r2 = (com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17251p) r2     // Catch:{ all -> 0x0038 }
            r2.accept(r13)     // Catch:{ all -> 0x0038 }
            r13 = r0
            com.google.android.apps.search.assistant.platform.e.b.a.e.g r13 = (com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120306g) r13     // Catch:{ all -> 0x0038 }
            com.google.common.f.e r13 = r13.f334728c     // Catch:{ all -> 0x0038 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0038 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0038 }
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0038 }
            r13.mo56378ag(r14, r4)     // Catch:{ all -> 0x0038 }
            java.lang.String r14 = "#assistDataBuilder: sending AssistData in S3 update request"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x0038 }
            r3 = 34713(0x8799, float:4.8643E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r13.mo56379ah(r2)     // Catch:{ all -> 0x0038 }
            r13.mo56386p(r14)     // Catch:{ all -> 0x0038 }
            p5462h.p5472e.C69598b.m101013a(r1, r6)     // Catch:{ all -> 0x01d8 }
            goto L_0x0210
        L_0x01d8:
            r13 = move-exception
            goto L_0x01eb
        L_0x01da:
            return r1
        L_0x01db:
            r13 = move-exception
            r0 = r2
            r1 = r3
            goto L_0x01e3
        L_0x01df:
            return r1
        L_0x01e0:
            r13 = move-exception
            r0 = r12
            r1 = r2
        L_0x01e3:
            throw r13     // Catch:{ all -> 0x01e4 }
        L_0x01e4:
            r14 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r13)     // Catch:{ all -> 0x01d8 }
            throw r14     // Catch:{ all -> 0x01d8 }
        L_0x01e9:
            r13 = move-exception
            r0 = r12
        L_0x01eb:
            com.google.android.apps.search.assistant.platform.e.b.a.e.g r0 = (com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120306g) r0
            com.google.common.f.e r14 = r0.f334728c
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r0, r4)
            com.google.common.f.x r13 = r14.mo56382g(r13)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r14 = new com.google.common.f.n
            r0 = 34714(0x879a, float:4.8645E-41)
            r14.<init>(r0)
            r13.mo56379ah(r14)
            java.lang.String r14 = "#assistDataBuilder: failed to send AssistData"
            r13.mo56386p(r14)
        L_0x0210:
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e.C120306g.mo104721b(j$.util.function.Consumer, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C60870cx mo23246c(Consumer consumer) {
        if (!this.f334726a.f333863e) {
            return C60866ct.f164955a;
        }
        return C32561x.m60381a(this.f334727b, new C120305f(this, consumer, (C69577g) null));
    }
}
