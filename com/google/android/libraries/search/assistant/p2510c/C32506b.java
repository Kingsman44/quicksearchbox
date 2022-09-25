package com.google.android.libraries.search.assistant.p2510c;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import com.google.android.apps.gsa.assist.C9332ac;
import com.google.android.apps.gsa.assist.C9333ad;
import com.google.android.apps.gsa.assist.C9345ap;
import com.google.android.apps.gsa.assist.C9346aq;
import com.google.android.apps.gsa.assist.C9347ar;
import com.google.android.apps.gsa.assist.C9386c;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.apps.gsa.assist.C9407e;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.C9417g;
import com.google.android.apps.gsa.assist.C9418h;
import com.google.android.apps.gsa.assist.C9421k;
import com.google.android.apps.gsa.assist.C9422l;
import com.google.android.apps.gsa.assist.C9425o;
import com.google.android.apps.gsa.assist.C9426p;
import com.google.android.apps.gsa.assist.C9427q;
import com.google.android.apps.gsa.assist.C9428r;
import com.google.android.apps.gsa.assist.C9429s;
import com.google.android.apps.gsa.assist.C9430t;
import com.google.android.apps.gsa.assist.C9431u;
import com.google.android.apps.gsa.assist.C9432v;
import com.google.android.apps.gsa.assist.C9433w;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.gms.vision.text.C146323c;
import com.google.android.gms.vision.text.C146324d;
import com.google.common.base.C58892db;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.c.b */
/* compiled from: PG */
public final class C32506b {

    /* renamed from: a */
    private static final C58974d f87081a = C58974d.m91136j();

    /* renamed from: a */
    public static C9405d m60315a(AssistStructure assistStructure) {
        C9386c cVar = (C9386c) C9405d.f32673k.createBuilder();
        if (assistStructure == null) {
            return (C9405d) cVar.build();
        }
        if (assistStructure.getActivityComponent() != null) {
            String flattenToString = assistStructure.getActivityComponent().flattenToString();
            cVar.copyOnWrite();
            C9405d dVar = (C9405d) cVar.instance;
            flattenToString.getClass();
            dVar.f32675a |= 1;
            dVar.f32676b = flattenToString;
        }
        int windowNodeCount = assistStructure.getWindowNodeCount();
        for (int i = 0; i < windowNodeCount; i++) {
            AssistStructure.WindowNode windowNodeAt = assistStructure.getWindowNodeAt(i);
            C9345ap apVar = (C9345ap) C9346aq.f32431g.createBuilder();
            int left = windowNodeAt.getLeft();
            apVar.copyOnWrite();
            C9346aq aqVar = (C9346aq) apVar.instance;
            aqVar.f32433a |= 1;
            aqVar.f32434b = left;
            int top = windowNodeAt.getTop();
            apVar.copyOnWrite();
            C9346aq aqVar2 = (C9346aq) apVar.instance;
            aqVar2.f32433a |= 2;
            aqVar2.f32435c = top;
            int width = windowNodeAt.getWidth();
            apVar.copyOnWrite();
            C9346aq aqVar3 = (C9346aq) apVar.instance;
            aqVar3.f32433a |= 4;
            aqVar3.f32436d = width;
            int height = windowNodeAt.getHeight();
            apVar.copyOnWrite();
            C9346aq aqVar4 = (C9346aq) apVar.instance;
            aqVar4.f32433a |= 8;
            aqVar4.f32437e = height;
            if (windowNodeAt.getTitle() != null) {
                String obj = windowNodeAt.getTitle().toString();
                apVar.copyOnWrite();
                C9346aq aqVar5 = (C9346aq) apVar.instance;
                obj.getClass();
                aqVar5.f32433a |= 16;
                aqVar5.f32438f = obj;
            }
            C9333ad adVar = (C9333ad) m60320f(windowNodeAt.getRootViewNode(), 0).toBuilder();
            adVar.copyOnWrite();
            C9347ar arVar = (C9347ar) adVar.instance;
            C9346aq aqVar6 = (C9346aq) apVar.build();
            aqVar6.getClass();
            arVar.f32461t = aqVar6;
            arVar.f32442a |= C89885b.S3REQUEST_VALUE;
            cVar.mo17578a((C9347ar) adVar.build());
        }
        return (C9405d) cVar.build();
    }

    /* renamed from: b */
    public static C9418h m60316b(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        C9417g gVar = (C9417g) C9418h.f32714k.createBuilder();
        gVar.mo17672a(m60318d((Bundle) optional.orElse(null), (AssistContent) optional2.orElse(null), (C32505a) optional3.orElse(null)));
        if (optional4.isPresent()) {
            Bitmap bitmap = (Bitmap) optional4.get();
            C63087y v = C63088z.m96150v();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 50, v);
            C9433w wVar = (C9433w) C9332ac.f32378j.createBuilder();
            int width = bitmap.getWidth();
            wVar.copyOnWrite();
            C9332ac acVar = (C9332ac) wVar.instance;
            acVar.f32380a |= 32;
            acVar.f32385f = width;
            int height = bitmap.getHeight();
            wVar.copyOnWrite();
            C9332ac acVar2 = (C9332ac) wVar.instance;
            acVar2.f32380a |= 64;
            acVar2.f32386g = height;
            wVar.copyOnWrite();
            C9332ac acVar3 = (C9332ac) wVar.instance;
            acVar3.f32380a |= 128;
            acVar3.f32387h = 50;
            wVar.copyOnWrite();
            C9332ac acVar4 = (C9332ac) wVar.instance;
            acVar4.f32384e = 1;
            acVar4.f32380a |= 16;
            C63088z b = v.mo59165b();
            wVar.copyOnWrite();
            C9332ac acVar5 = (C9332ac) wVar.instance;
            b.getClass();
            acVar5.f32380a |= 2;
            acVar5.f32381b = b;
            C9332ac acVar6 = (C9332ac) wVar.build();
            gVar.copyOnWrite();
            C9418h hVar = (C9418h) gVar.instance;
            acVar6.getClass();
            hVar.f32719d = acVar6;
            hVar.f32716a |= 2;
        }
        if (optional5.isPresent()) {
            C9432v c = m60317c((C58485gu) optional5.get());
            gVar.copyOnWrite();
            C9418h hVar2 = (C9418h) gVar.instance;
            c.getClass();
            hVar2.f32721f = c;
            hVar2.f32716a |= 8;
        }
        return (C9418h) gVar.build();
    }

    /* renamed from: c */
    public static C9432v m60317c(C58485gu guVar) {
        C9425o oVar = (C9425o) C9432v.f32760b.createBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C146324d dVar = (C146324d) guVar.get(i);
            C9428r rVar = (C9428r) C9429s.f32748d.createBuilder();
            C9421k e = m60319e(dVar.mo122887a());
            rVar.copyOnWrite();
            C9429s sVar = (C9429s) rVar.instance;
            C9422l lVar = (C9422l) e.build();
            lVar.getClass();
            sVar.f32752c = lVar;
            sVar.f32750a |= 1;
            for (C146323c cVar : dVar.mo122891e()) {
                C9426p pVar = (C9426p) C9427q.f32742d.createBuilder();
                C9421k e2 = m60319e(cVar.mo122887a());
                pVar.copyOnWrite();
                C9427q qVar = (C9427q) pVar.instance;
                C9422l lVar2 = (C9422l) e2.build();
                lVar2.getClass();
                qVar.f32746c = lVar2;
                qVar.f32744a |= 1;
                for (C146323c cVar2 : cVar.mo122889c()) {
                    C9430t tVar = (C9430t) C9431u.f32754d.createBuilder();
                    String b = cVar2.mo122888b();
                    tVar.copyOnWrite();
                    C9431u uVar = (C9431u) tVar.instance;
                    b.getClass();
                    uVar.f32756a |= 1;
                    uVar.f32757b = b;
                    C9421k e3 = m60319e(cVar2.mo122887a());
                    tVar.copyOnWrite();
                    C9431u uVar2 = (C9431u) tVar.instance;
                    C9422l lVar3 = (C9422l) e3.build();
                    lVar3.getClass();
                    uVar2.f32758c = lVar3;
                    uVar2.f32756a |= 2;
                    C9431u uVar3 = (C9431u) tVar.build();
                    pVar.copyOnWrite();
                    C9427q qVar2 = (C9427q) pVar.instance;
                    uVar3.getClass();
                    C62971cq cqVar = qVar2.f32745b;
                    if (!cqVar.mo58948c()) {
                        qVar2.f32745b = C62942bv.mutableCopy(cqVar);
                    }
                    qVar2.f32745b.add(uVar3);
                }
                rVar.copyOnWrite();
                C9429s sVar2 = (C9429s) rVar.instance;
                C9427q qVar3 = (C9427q) pVar.build();
                qVar3.getClass();
                C62971cq cqVar2 = sVar2.f32751b;
                if (!cqVar2.mo58948c()) {
                    sVar2.f32751b = C62942bv.mutableCopy(cqVar2);
                }
                sVar2.f32751b.add(qVar3);
            }
            oVar.copyOnWrite();
            C9432v vVar = (C9432v) oVar.instance;
            C9429s sVar3 = (C9429s) rVar.build();
            sVar3.getClass();
            C62971cq cqVar3 = vVar.f32762a;
            if (!cqVar3.mo58948c()) {
                vVar.f32762a = C62942bv.mutableCopy(cqVar3);
            }
            vVar.f32762a.add(sVar3);
        }
        return (C9432v) oVar.build();
    }

    /* renamed from: d */
    private static C9410f m60318d(Bundle bundle, AssistContent assistContent, C32505a aVar) {
        String string;
        C9407e eVar = (C9407e) C9410f.f32690f.createBuilder();
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
                    ((C58970a) ((C58970a) ((C58970a) f87081a.mo56225c()).mo56382g(e)).mo56372aa(50560)).mo56386p("Error accessing activityIntent.");
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
        if (aVar != null) {
            cVar.mergeFrom(aVar.mo38113a());
        }
        eVar.mo17658a(cVar);
        return (C9410f) eVar.build();
    }

    /* renamed from: e */
    private static C9421k m60319e(Rect rect) {
        C9421k kVar = (C9421k) C9422l.f32728g.createBuilder();
        int i = rect.top;
        kVar.copyOnWrite();
        C9422l lVar = (C9422l) kVar.instance;
        lVar.f32730a |= 1;
        lVar.f32731b = i;
        int i2 = rect.left;
        kVar.copyOnWrite();
        C9422l lVar2 = (C9422l) kVar.instance;
        lVar2.f32730a |= 2;
        lVar2.f32732c = i2;
        int i3 = rect.right;
        int i4 = rect.left;
        kVar.copyOnWrite();
        C9422l lVar3 = (C9422l) kVar.instance;
        lVar3.f32730a |= 4;
        lVar3.f32733d = i3 - i4;
        int i5 = rect.bottom;
        int i6 = rect.top;
        kVar.copyOnWrite();
        C9422l lVar4 = (C9422l) kVar.instance;
        lVar4.f32730a |= 8;
        lVar4.f32734e = i5 - i6;
        return kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0397, code lost:
        if (r7 != false) goto L_0x0399;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.apps.gsa.assist.C9347ar m60320f(android.app.assist.AssistStructure.ViewNode r11, int r12) {
        /*
            com.google.android.apps.gsa.assist.ar r0 = com.google.android.apps.gsa.assist.C9347ar.f32439A
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.assist.ad r0 = (com.google.android.apps.gsa.assist.C9333ad) r0
            int r1 = r11.getWidth()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r3 = r3 | 16
            r2.f32442a = r3
            r2.f32448g = r1
            int r1 = r11.getHeight()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r3 = r3 | 32
            r2.f32442a = r3
            r2.f32449h = r1
            int r1 = r11.getLeft()
            r2 = 1
            if (r1 == 0) goto L_0x0047
            int r1 = r11.getLeft()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            int r4 = r3.f32442a
            r4 = r4 | r2
            r3.f32442a = r4
            r3.f32444c = r1
        L_0x0047:
            int r1 = r11.getTop()
            r3 = 2
            if (r1 == 0) goto L_0x0060
            int r1 = r11.getTop()
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assist.ar r4 = (com.google.android.apps.gsa.assist.C9347ar) r4
            int r5 = r4.f32442a
            r5 = r5 | r3
            r4.f32442a = r5
            r4.f32445d = r1
        L_0x0060:
            int r1 = r11.getScrollX()
            r4 = 4
            if (r1 == 0) goto L_0x0079
            int r1 = r11.getScrollX()
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.gsa.assist.ar r5 = (com.google.android.apps.gsa.assist.C9347ar) r5
            int r6 = r5.f32442a
            r6 = r6 | r4
            r5.f32442a = r6
            r5.f32446e = r1
        L_0x0079:
            int r1 = r11.getScrollY()
            r5 = 8
            if (r1 == 0) goto L_0x0093
            int r1 = r11.getScrollY()
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.assist.ar r6 = (com.google.android.apps.gsa.assist.C9347ar) r6
            int r7 = r6.f32442a
            r7 = r7 | r5
            r6.f32442a = r7
            r6.f32447f = r1
        L_0x0093:
            int r1 = r11.getVisibility()
            r6 = 0
            if (r1 == 0) goto L_0x00bf
            if (r1 == r4) goto L_0x00af
            if (r1 == r5) goto L_0x009f
            goto L_0x00ce
        L_0x009f:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assist.ar r1 = (com.google.android.apps.gsa.assist.C9347ar) r1
            r1.f32450i = r3
            int r7 = r1.f32442a
            r7 = r7 | 64
            r1.f32442a = r7
            goto L_0x00ce
        L_0x00af:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assist.ar r1 = (com.google.android.apps.gsa.assist.C9347ar) r1
            r1.f32450i = r2
            int r7 = r1.f32442a
            r7 = r7 | 64
            r1.f32442a = r7
            goto L_0x00ce
        L_0x00bf:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assist.ar r1 = (com.google.android.apps.gsa.assist.C9347ar) r1
            r1.f32450i = r6
            int r7 = r1.f32442a
            r7 = r7 | 64
            r1.f32442a = r7
        L_0x00ce:
            com.google.android.apps.gsa.assist.aj r1 = com.google.android.apps.gsa.assist.C9339aj.f32401m
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.ai r1 = (com.google.android.apps.gsa.assist.C9338ai) r1
            boolean r7 = r11.isEnabled()
            if (r7 == 0) goto L_0x00ee
            boolean r7 = r11.isEnabled()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r2
            r8.f32403a = r9
            r8.f32404b = r7
        L_0x00ee:
            boolean r7 = r11.isClickable()
            if (r7 == 0) goto L_0x0106
            boolean r7 = r11.isClickable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r3
            r8.f32403a = r9
            r8.f32405c = r7
        L_0x0106:
            boolean r7 = r11.isFocusable()
            if (r7 == 0) goto L_0x011e
            boolean r7 = r11.isFocusable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r4
            r8.f32403a = r9
            r8.f32406d = r7
        L_0x011e:
            boolean r7 = r11.isFocused()
            if (r7 == 0) goto L_0x0136
            boolean r7 = r11.isFocused()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r5
            r8.f32403a = r9
            r8.f32407e = r7
        L_0x0136:
            boolean r7 = r11.isAccessibilityFocused()
            if (r7 == 0) goto L_0x014f
            boolean r7 = r11.isAccessibilityFocused()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 16
            r8.f32403a = r9
            r8.f32408f = r7
        L_0x014f:
            boolean r7 = r11.isCheckable()
            if (r7 == 0) goto L_0x0168
            boolean r7 = r11.isCheckable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 32
            r8.f32403a = r9
            r8.f32409g = r7
        L_0x0168:
            boolean r7 = r11.isChecked()
            if (r7 == 0) goto L_0x0181
            boolean r7 = r11.isChecked()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 64
            r8.f32403a = r9
            r8.f32410h = r7
        L_0x0181:
            boolean r7 = r11.isSelected()
            if (r7 == 0) goto L_0x019a
            boolean r7 = r11.isSelected()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r8.f32403a = r9
            r8.f32411i = r7
        L_0x019a:
            boolean r7 = r11.isActivated()
            if (r7 == 0) goto L_0x01b3
            boolean r7 = r11.isActivated()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r8.f32403a = r9
            r8.f32412j = r7
        L_0x01b3:
            boolean r7 = r11.isLongClickable()
            if (r7 == 0) goto L_0x01cc
            boolean r7 = r11.isLongClickable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.f32403a = r9
            r8.f32413k = r7
        L_0x01cc:
            boolean r7 = r11.isAssistBlocked()
            if (r7 == 0) goto L_0x01e5
            boolean r7 = r11.isAssistBlocked()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.f32403a = r9
            r8.f32414l = r7
        L_0x01e5:
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.aj r1 = (com.google.android.apps.gsa.assist.C9339aj) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            r1.getClass()
            r7.f32451j = r1
            int r1 = r7.f32442a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r7.f32442a = r1
            java.lang.String r1 = r11.getClassName()
            if (r1 == 0) goto L_0x0219
            java.lang.String r1 = r11.getClassName()
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            r1.getClass()
            int r8 = r7.f32442a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r7.f32442a = r8
            r7.f32452k = r1
        L_0x0219:
            java.lang.CharSequence r1 = r11.getContentDescription()
            boolean r1 = m60321g(r1)
            if (r1 == 0) goto L_0x023d
            java.lang.CharSequence r1 = r11.getContentDescription()
            java.lang.String r1 = r1.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            r1.getClass()
            int r8 = r7.f32442a
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r7.f32442a = r8
            r7.f32453l = r1
        L_0x023d:
            java.lang.CharSequence r1 = r11.getText()
            boolean r1 = m60321g(r1)
            if (r1 == 0) goto L_0x0261
            java.lang.CharSequence r1 = r11.getText()
            java.lang.String r1 = r1.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            r1.getClass()
            int r8 = r7.f32442a
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r7.f32442a = r8
            r7.f32454m = r1
        L_0x0261:
            java.lang.String r1 = r11.getIdEntry()
            if (r1 == 0) goto L_0x027e
            java.lang.String r1 = r11.getIdEntry()
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            r1.getClass()
            int r8 = r7.f32442a
            r9 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r9
            r7.f32442a = r8
            r7.f32465x = r1
        L_0x027e:
            int r1 = r11.getTextSelectionStart()
            r7 = -1
            if (r1 != r7) goto L_0x028b
            int r1 = r11.getTextSelectionEnd()
            if (r1 == r7) goto L_0x02cf
        L_0x028b:
            com.google.android.apps.gsa.assist.al r1 = com.google.android.apps.gsa.assist.C9341al.f32415d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.ak r1 = (com.google.android.apps.gsa.assist.C9340ak) r1
            int r7 = r11.getTextSelectionStart()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.al r8 = (com.google.android.apps.gsa.assist.C9341al) r8
            int r9 = r8.f32417a
            r9 = r9 | r2
            r8.f32417a = r9
            r8.f32418b = r7
            int r7 = r11.getTextSelectionEnd()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.al r8 = (com.google.android.apps.gsa.assist.C9341al) r8
            int r9 = r8.f32417a
            r9 = r9 | r3
            r8.f32417a = r9
            r8.f32419c = r7
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.al r1 = (com.google.android.apps.gsa.assist.C9341al) r1
            r1.getClass()
            r7.f32455n = r1
            int r1 = r7.f32442a
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r7.f32442a = r1
        L_0x02cf:
            java.lang.String r1 = r11.getHint()
            if (r1 == 0) goto L_0x02eb
            java.lang.String r1 = r11.getHint()
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            r1.getClass()
            int r8 = r7.f32442a
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.f32442a = r8
            r7.f32456o = r1
        L_0x02eb:
            com.google.android.apps.gsa.assist.an r1 = com.google.android.apps.gsa.assist.C9343an.f32420i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.am r1 = (com.google.android.apps.gsa.assist.C9342am) r1
            int r7 = r11.getTextColor()
            if (r7 == r2) goto L_0x030d
            int r7 = r11.getTextColor()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.an r8 = (com.google.android.apps.gsa.assist.C9343an) r8
            int r9 = r8.f32422a
            r9 = r9 | r2
            r8.f32422a = r9
            r8.f32423b = r7
            r7 = 1
            goto L_0x030e
        L_0x030d:
            r7 = 0
        L_0x030e:
            int r8 = r11.getTextBackgroundColor()
            if (r8 == r2) goto L_0x0327
            int r7 = r11.getTextBackgroundColor()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.an r8 = (com.google.android.apps.gsa.assist.C9343an) r8
            int r9 = r8.f32422a
            r9 = r9 | r3
            r8.f32422a = r9
            r8.f32424c = r7
            r7 = 1
        L_0x0327:
            float r8 = r11.getTextSize()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0343
            float r7 = r11.getTextSize()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.an r8 = (com.google.android.apps.gsa.assist.C9343an) r8
            int r10 = r8.f32422a
            r4 = r4 | r10
            r8.f32422a = r4
            r8.f32425d = r7
            r7 = 1
        L_0x0343:
            int r4 = r11.getTextStyle()
            if (r4 <= 0) goto L_0x0397
            r8 = r4 & 1
            if (r8 == 0) goto L_0x035c
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.apps.gsa.assist.an r7 = (com.google.android.apps.gsa.assist.C9343an) r7
            int r8 = r7.f32422a
            r8 = r8 | r5
            r7.f32422a = r8
            r7.f32426e = r2
            r7 = 1
        L_0x035c:
            r8 = r4 & 2
            if (r8 == 0) goto L_0x0370
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.apps.gsa.assist.an r7 = (com.google.android.apps.gsa.assist.C9343an) r7
            int r8 = r7.f32422a
            r8 = r8 | 16
            r7.f32422a = r8
            r7.f32427f = r2
            r7 = 1
        L_0x0370:
            r8 = r4 & 4
            if (r8 == 0) goto L_0x0384
            r1.copyOnWrite()
            com.google.protobuf.bv r7 = r1.instance
            com.google.android.apps.gsa.assist.an r7 = (com.google.android.apps.gsa.assist.C9343an) r7
            int r8 = r7.f32422a
            r8 = r8 | 32
            r7.f32422a = r8
            r7.f32428g = r2
            r7 = 1
        L_0x0384:
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0397
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.assist.an r4 = (com.google.android.apps.gsa.assist.C9343an) r4
            int r5 = r4.f32422a
            r5 = r5 | 64
            r4.f32422a = r5
            r4.f32429h = r2
            goto L_0x0399
        L_0x0397:
            if (r7 == 0) goto L_0x03b1
        L_0x0399:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assist.ar r4 = (com.google.android.apps.gsa.assist.C9347ar) r4
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.an r1 = (com.google.android.apps.gsa.assist.C9343an) r1
            r1.getClass()
            r4.f32457p = r1
            int r1 = r4.f32442a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r4.f32442a = r1
        L_0x03b1:
            android.os.Bundle r1 = r11.getExtras()
            if (r1 == 0) goto L_0x03d3
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String r4 = "role"
            java.lang.String r1 = r1.getString(r4)
            if (r1 == 0) goto L_0x03d3
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assist.ar r4 = (com.google.android.apps.gsa.assist.C9347ar) r4
            int r5 = r4.f32442a
            r7 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 | r7
            r4.f32442a = r5
            r4.f32464w = r1
        L_0x03d3:
            int[] r1 = r11.getTextLineBaselines()
            if (r1 == 0) goto L_0x03e4
            int[] r1 = r11.getTextLineBaselines()
            java.util.List r1 = com.google.common.p4575r.C60757n.m92749j(r1)
            r0.mo17540a(r1)
        L_0x03e4:
            int[] r1 = r11.getTextLineCharOffsets()
            if (r1 == 0) goto L_0x03f5
            int[] r1 = r11.getTextLineCharOffsets()
            java.util.List r1 = com.google.common.p4575r.C60757n.m92749j(r1)
            r0.mo17541b(r1)
        L_0x03f5:
            android.graphics.Matrix r1 = r11.getTransformation()
            if (r1 == 0) goto L_0x0409
            r4 = 9
            float[] r4 = new float[r4]
            r1.getValues(r4)
            java.util.List r1 = com.google.common.p4575r.C60752i.m92731e(r4)
            r0.mo17542c(r1)
        L_0x0409:
            float r1 = r11.getElevation()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0426
            float r1 = r11.getElevation()
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assist.ar r4 = (com.google.android.apps.gsa.assist.C9347ar) r4
            int r5 = r4.f32442a
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r7
            r4.f32442a = r5
            r4.f32459r = r1
        L_0x0426:
            float r1 = r11.getAlpha()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0442
            float r1 = r11.getAlpha()
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assist.ar r4 = (com.google.android.apps.gsa.assist.C9347ar) r4
            int r5 = r4.f32442a
            r7 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r7
            r4.f32442a = r5
            r4.f32460s = r1
        L_0x0442:
            android.view.ViewStructure$HtmlInfo r1 = r11.getHtmlInfo()
            if (r1 == 0) goto L_0x04e7
            com.google.android.apps.gsa.assist.ah r1 = com.google.android.apps.gsa.assist.C9337ah.f32395e
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.ae r1 = (com.google.android.apps.gsa.assist.C9334ae) r1
            android.view.ViewStructure$HtmlInfo r4 = r11.getHtmlInfo()
            java.util.List r4 = r4.getAttributes()
            if (r4 == 0) goto L_0x04b5
            java.util.Iterator r4 = r4.iterator()
        L_0x045e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x04b5
            java.lang.Object r5 = r4.next()
            android.util.Pair r5 = (android.util.Pair) r5
            com.google.android.apps.gsa.assist.ag r7 = com.google.android.apps.gsa.assist.C9336ag.f32390d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.assist.af r7 = (com.google.android.apps.gsa.assist.C9335af) r7
            java.lang.Object r8 = r5.first
            java.lang.String r8 = (java.lang.String) r8
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.android.apps.gsa.assist.ag r9 = (com.google.android.apps.gsa.assist.C9336ag) r9
            r8.getClass()
            int r10 = r9.f32392a
            r10 = r10 | r2
            r9.f32392a = r10
            r9.f32393b = r8
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.gsa.assist.ag r8 = (com.google.android.apps.gsa.assist.C9336ag) r8
            r5.getClass()
            int r9 = r8.f32392a
            r9 = r9 | r3
            r8.f32392a = r9
            r8.f32394c = r5
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.gsa.assist.ah r5 = (com.google.android.apps.gsa.assist.C9337ah) r5
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.assist.ag r7 = (com.google.android.apps.gsa.assist.C9336ag) r7
            r7.getClass()
            r5.mo17543a()
            com.google.protobuf.cq r5 = r5.f32399c
            r5.add(r7)
            goto L_0x045e
        L_0x04b5:
            android.view.ViewStructure$HtmlInfo r3 = r11.getHtmlInfo()
            java.lang.String r3 = r3.getTag()
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.gsa.assist.ah r4 = (com.google.android.apps.gsa.assist.C9337ah) r4
            r3.getClass()
            int r5 = r4.f32397a
            r5 = r5 | r2
            r4.f32397a = r5
            r4.f32398b = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.ah r1 = (com.google.android.apps.gsa.assist.C9337ah) r1
            r1.getClass()
            r3.f32467z = r1
            int r1 = r3.f32442a
            r4 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r4
            r3.f32442a = r1
        L_0x04e7:
            r1 = 50
            if (r12 >= r1) goto L_0x0512
            int r1 = r11.getChildCount()
        L_0x04ef:
            if (r6 >= r1) goto L_0x0512
            android.app.assist.AssistStructure$ViewNode r3 = r11.getChildAt(r6)
            if (r3 == 0) goto L_0x050f
            int r4 = r12 + 1
            com.google.android.apps.gsa.assist.ar r3 = m60320f(r3, r4)
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.android.apps.gsa.assist.ar r4 = (com.google.android.apps.gsa.assist.C9347ar) r4
            r3.getClass()
            r4.mo17544a()
            com.google.protobuf.cq r4 = r4.f32443b
            r4.add(r3)
        L_0x050f:
            int r6 = r6 + 1
            goto L_0x04ef
        L_0x0512:
            com.google.protobuf.bv r11 = r0.build()
            com.google.android.apps.gsa.assist.ar r11 = (com.google.android.apps.gsa.assist.C9347ar) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2510c.C32506b.m60320f(android.app.assist.AssistStructure$ViewNode, int):com.google.android.apps.gsa.assist.ar");
    }

    /* renamed from: g */
    private static boolean m60321g(CharSequence charSequence) {
        if (charSequence != null) {
            try {
                if (C58892db.m90995a(charSequence.toString()) >= 0) {
                    return true;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }
}
