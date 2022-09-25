package com.google.android.apps.gsa.staticplugins.p7960g.p7961a;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import com.google.android.apps.gsa.assist.C9333ad;
import com.google.android.apps.gsa.assist.C9345ap;
import com.google.android.apps.gsa.assist.C9346aq;
import com.google.android.apps.gsa.assist.C9347ar;
import com.google.android.apps.gsa.assist.C9386c;
import com.google.android.apps.gsa.assist.C9405d;
import com.google.android.apps.gsa.assist.C9407e;
import com.google.android.apps.gsa.assist.C9410f;
import com.google.android.apps.gsa.assist.C9423m;
import com.google.android.apps.gsa.assist.C9424n;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58892db;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.a.j */
/* compiled from: PG */
public final class C101272j {

    /* renamed from: a */
    public static final C59071e f282651a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.g.a.j");

    /* renamed from: a */
    public static Bitmap m167532a(Future future, C9313a aVar, boolean z) {
        Bitmap bitmap;
        if (z) {
            aVar.mo17503a(8);
        }
        try {
            bitmap = (Bitmap) C90877ak.m148472f(future);
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f282651a.mo56225c()).mo56382g(e)).mo56372aa(13845)).mo56386p("Error waiting for screenshot");
            bitmap = null;
        }
        if (z) {
            aVar.mo17504b(8);
        }
        return bitmap;
    }

    /* renamed from: b */
    public static C9410f m167533b(Bundle bundle, AssistStructure assistStructure, AssistContent assistContent, Context context, C86124t tVar, C9321i iVar, boolean z, C9313a aVar) {
        int i;
        String coerceToHtmlText;
        AssistStructure assistStructure2 = assistStructure;
        C9313a aVar2 = aVar;
        C90748e.m148224b();
        aVar2.mo17503a(4);
        Bundle bundle2 = bundle;
        String string = bundle.getString("android.intent.extra.ASSIST_PACKAGE");
        string.getClass();
        C9407e eVar = (C9407e) C9410f.f32690f.createBuilder();
        eVar.copyOnWrite();
        C9410f fVar = (C9410f) eVar.instance;
        fVar.f32692a |= 1;
        fVar.f32693b = string;
        try {
            i = context.getPackageManager().getPackageInfo(string, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            ((C59052c) ((C59052c) f282651a.mo56225c()).mo56372aa(13843)).mo56389s("Package %s not found.", string);
            i = 0;
        }
        eVar.copyOnWrite();
        C9410f fVar2 = (C9410f) eVar.instance;
        fVar2.f32692a |= 4;
        fVar2.f32695d = i;
        C9386c cVar = (C9386c) C9405d.f32673k.createBuilder();
        Intent intent = assistContent.getIntent();
        Uri webUri = assistContent.getWebUri();
        if (intent != null) {
            if (webUri != null) {
                try {
                    if ("android.intent.action.VIEW".equals(intent.getAction()) && webUri.equals(intent.getData())) {
                    }
                } catch (AndroidRuntimeException e) {
                    ((C59052c) ((C59052c) ((C59052c) f282651a.mo56226d()).mo56382g(e)).mo56372aa(13847)).mo56386p("Error accessing activityIntent.");
                    int i2 = C90755l.f253831a;
                }
            }
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
        ClipData clipData = assistContent.getClipData();
        if (clipData != null) {
            CharSequence label = clipData.getDescription() != null ? clipData.getDescription().getLabel() : null;
            if (label != null || clipData.getItemCount() > 0) {
                C9423m mVar = (C9423m) C9424n.f32737d.createBuilder();
                if (label != null) {
                    String obj = label.toString();
                    mVar.copyOnWrite();
                    C9424n nVar = (C9424n) mVar.instance;
                    obj.getClass();
                    nVar.f32739a |= 1;
                    nVar.f32740b = obj;
                }
                ArrayList arrayList = new ArrayList(clipData.getItemCount());
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    ClipData.Item itemAt = clipData.getItemAt(i3);
                    Context context2 = context;
                    if (!(itemAt == null || (coerceToHtmlText = itemAt.coerceToHtmlText(context2)) == null)) {
                        arrayList.add(coerceToHtmlText);
                    }
                }
                mVar.copyOnWrite();
                C9424n nVar2 = (C9424n) mVar.instance;
                C62971cq cqVar = nVar2.f32741c;
                if (!cqVar.mo58948c()) {
                    nVar2.f32741c = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) arrayList, (List) nVar2.f32741c);
                cVar.copyOnWrite();
                C9405d dVar5 = (C9405d) cVar.instance;
                C9424n nVar3 = (C9424n) mVar.build();
                nVar3.getClass();
                dVar5.f32680f = nVar3;
                dVar5.f32675a |= 16;
            }
        }
        if (assistContent.getStructuredData() != null) {
            String structuredData = assistContent.getStructuredData();
            cVar.copyOnWrite();
            C9405d dVar6 = (C9405d) cVar.instance;
            structuredData.getClass();
            dVar6.f32675a |= 256;
            dVar6.f32684j = structuredData;
        }
        boolean z2 = assistStructure2 != null;
        cVar.copyOnWrite();
        C9405d dVar7 = (C9405d) cVar.instance;
        dVar7.f32675a |= 128;
        dVar7.f32683i = z2;
        if (assistStructure2 != null && z) {
            if (assistStructure.getActivityComponent() != null) {
                String flattenToString = assistStructure.getActivityComponent().flattenToString();
                cVar.copyOnWrite();
                C9405d dVar8 = (C9405d) cVar.instance;
                flattenToString.getClass();
                dVar8.f32675a |= 1;
                dVar8.f32676b = flattenToString;
            }
            int windowNodeCount = assistStructure.getWindowNodeCount();
            for (int i4 = 0; i4 < windowNodeCount; i4++) {
                AssistStructure.WindowNode windowNodeAt = assistStructure.getWindowNodeAt(i4);
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
                    String obj2 = windowNodeAt.getTitle().toString();
                    apVar.copyOnWrite();
                    C9346aq aqVar5 = (C9346aq) apVar.instance;
                    obj2.getClass();
                    aqVar5.f32433a |= 16;
                    aqVar5.f32438f = obj2;
                }
                C9333ad adVar = (C9333ad) m167535d(tVar, windowNodeAt.getRootViewNode(), 0).toBuilder();
                adVar.copyOnWrite();
                C9347ar arVar = (C9347ar) adVar.instance;
                C9346aq aqVar6 = (C9346aq) apVar.build();
                aqVar6.getClass();
                arVar.f32461t = aqVar6;
                arVar.f32442a |= C89885b.S3REQUEST_VALUE;
                cVar.mo17578a((C9347ar) adVar.build());
            }
        }
        eVar.mo17658a(cVar);
        if (z) {
            iVar.f32346g = (C9410f) eVar.build();
        }
        aVar2.mo17504b(4);
        return (C9410f) eVar.build();
    }

    /* renamed from: c */
    public static boolean m167534c(Bitmap bitmap) {
        return (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x032a, code lost:
        if (r3 != false) goto L_0x032c;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.apps.gsa.assist.C9347ar m167535d(com.google.android.apps.gsa.search.core.p6805i.C86124t r12, android.app.assist.AssistStructure.ViewNode r13, int r14) {
        /*
            com.google.android.apps.gsa.assist.ar r0 = com.google.android.apps.gsa.assist.C9347ar.f32439A
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.gsa.assist.ad r0 = (com.google.android.apps.gsa.assist.C9333ad) r0
            int r1 = r13.getLeft()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r4 = 1
            r3 = r3 | r4
            r2.f32442a = r3
            r2.f32444c = r1
            int r1 = r13.getTop()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r5 = 2
            r3 = r3 | r5
            r2.f32442a = r3
            r2.f32445d = r1
            int r1 = r13.getScrollX()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r6 = 4
            r3 = r3 | r6
            r2.f32442a = r3
            r2.f32446e = r1
            int r1 = r13.getScrollY()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r7 = 8
            r3 = r3 | r7
            r2.f32442a = r3
            r2.f32447f = r1
            int r1 = r13.getWidth()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r3 = r3 | 16
            r2.f32442a = r3
            r2.f32448g = r1
            int r1 = r13.getHeight()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.gsa.assist.ar r2 = (com.google.android.apps.gsa.assist.C9347ar) r2
            int r3 = r2.f32442a
            r3 = r3 | 32
            r2.f32442a = r3
            r2.f32449h = r1
            int r1 = r13.getVisibility()
            r2 = 0
            if (r1 == 0) goto L_0x00a7
            if (r1 == r6) goto L_0x0097
            if (r1 == r7) goto L_0x0087
            goto L_0x00b6
        L_0x0087:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assist.ar r1 = (com.google.android.apps.gsa.assist.C9347ar) r1
            r1.f32450i = r5
            int r3 = r1.f32442a
            r3 = r3 | 64
            r1.f32442a = r3
            goto L_0x00b6
        L_0x0097:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assist.ar r1 = (com.google.android.apps.gsa.assist.C9347ar) r1
            r1.f32450i = r4
            int r3 = r1.f32442a
            r3 = r3 | 64
            r1.f32442a = r3
            goto L_0x00b6
        L_0x00a7:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.gsa.assist.ar r1 = (com.google.android.apps.gsa.assist.C9347ar) r1
            r1.f32450i = r2
            int r3 = r1.f32442a
            r3 = r3 | 64
            r1.f32442a = r3
        L_0x00b6:
            com.google.android.apps.gsa.assist.aj r1 = com.google.android.apps.gsa.assist.C9339aj.f32401m
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.ai r1 = (com.google.android.apps.gsa.assist.C9338ai) r1
            boolean r3 = r13.isEnabled()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r4
            r8.f32403a = r9
            r8.f32404b = r3
            boolean r3 = r13.isClickable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r5
            r8.f32403a = r9
            r8.f32405c = r3
            boolean r3 = r13.isFocusable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r6
            r8.f32403a = r9
            r8.f32406d = r3
            boolean r3 = r13.isFocused()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | r7
            r8.f32403a = r9
            r8.f32407e = r3
            boolean r3 = r13.isAccessibilityFocused()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 16
            r8.f32403a = r9
            r8.f32408f = r3
            boolean r3 = r13.isCheckable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 32
            r8.f32403a = r9
            r8.f32409g = r3
            boolean r3 = r13.isChecked()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 64
            r8.f32403a = r9
            r8.f32410h = r3
            boolean r3 = r13.isSelected()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r8.f32403a = r9
            r8.f32411i = r3
            boolean r3 = r13.isActivated()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r8.f32403a = r9
            r8.f32412j = r3
            boolean r3 = r13.isLongClickable()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.f32403a = r9
            r8.f32413k = r3
            boolean r3 = r13.isAssistBlocked()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.aj r8 = (com.google.android.apps.gsa.assist.C9339aj) r8
            int r9 = r8.f32403a
            r9 = r9 | 1024(0x400, float:1.435E-42)
            r8.f32403a = r9
            r8.f32414l = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.aj r1 = (com.google.android.apps.gsa.assist.C9339aj) r1
            r1.getClass()
            r3.f32451j = r1
            int r1 = r3.f32442a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r3.f32442a = r1
            java.lang.String r1 = r13.getClassName()
            if (r1 == 0) goto L_0x01b8
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            int r8 = r3.f32442a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r3.f32442a = r8
            r3.f32452k = r1
        L_0x01b8:
            java.lang.String r1 = r13.getIdEntry()
            if (r1 == 0) goto L_0x01ce
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            int r8 = r3.f32442a
            r9 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r9
            r3.f32442a = r8
            r3.f32465x = r1
        L_0x01ce:
            java.lang.CharSequence r1 = r13.getContentDescription()
            if (r1 == 0) goto L_0x01f4
            java.lang.CharSequence r3 = r13.getContentDescription()
            boolean r3 = m167536e(r3)
            if (r3 == 0) goto L_0x01f4
            java.lang.String r1 = r1.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            r1.getClass()
            int r8 = r3.f32442a
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r3.f32442a = r8
            r3.f32453l = r1
        L_0x01f4:
            java.lang.CharSequence r1 = r13.getText()
            if (r1 == 0) goto L_0x021a
            java.lang.CharSequence r3 = r13.getText()
            boolean r3 = m167536e(r3)
            if (r3 == 0) goto L_0x021a
            java.lang.String r1 = r1.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            r1.getClass()
            int r8 = r3.f32442a
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r3.f32442a = r8
            r3.f32454m = r1
        L_0x021a:
            int r1 = r13.getTextSelectionStart()
            r3 = -1
            if (r1 != r3) goto L_0x0227
            int r1 = r13.getTextSelectionEnd()
            if (r1 == r3) goto L_0x026b
        L_0x0227:
            com.google.android.apps.gsa.assist.al r1 = com.google.android.apps.gsa.assist.C9341al.f32415d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.ak r1 = (com.google.android.apps.gsa.assist.C9340ak) r1
            int r3 = r13.getTextSelectionStart()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.al r8 = (com.google.android.apps.gsa.assist.C9341al) r8
            int r9 = r8.f32417a
            r9 = r9 | r4
            r8.f32417a = r9
            r8.f32418b = r3
            int r3 = r13.getTextSelectionEnd()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.al r8 = (com.google.android.apps.gsa.assist.C9341al) r8
            int r9 = r8.f32417a
            r9 = r9 | r5
            r8.f32417a = r9
            r8.f32419c = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.al r1 = (com.google.android.apps.gsa.assist.C9341al) r1
            r1.getClass()
            r3.f32455n = r1
            int r1 = r3.f32442a
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r3.f32442a = r1
        L_0x026b:
            java.lang.String r1 = r13.getHint()
            if (r1 == 0) goto L_0x0280
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            int r8 = r3.f32442a
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r3.f32442a = r8
            r3.f32456o = r1
        L_0x0280:
            com.google.android.apps.gsa.assist.an r1 = com.google.android.apps.gsa.assist.C9343an.f32420i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.assist.am r1 = (com.google.android.apps.gsa.assist.C9342am) r1
            int r3 = r13.getTextColor()
            if (r3 == r4) goto L_0x02a2
            int r3 = r13.getTextColor()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.an r8 = (com.google.android.apps.gsa.assist.C9343an) r8
            int r9 = r8.f32422a
            r9 = r9 | r4
            r8.f32422a = r9
            r8.f32423b = r3
            r3 = 1
            goto L_0x02a3
        L_0x02a2:
            r3 = 0
        L_0x02a3:
            int r8 = r13.getTextBackgroundColor()
            if (r8 == r4) goto L_0x02bc
            int r3 = r13.getTextBackgroundColor()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.an r8 = (com.google.android.apps.gsa.assist.C9343an) r8
            int r9 = r8.f32422a
            r9 = r9 | r5
            r8.f32422a = r9
            r8.f32424c = r3
            r3 = 1
        L_0x02bc:
            float r8 = r13.getTextSize()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x02d8
            float r3 = r13.getTextSize()
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.gsa.assist.an r8 = (com.google.android.apps.gsa.assist.C9343an) r8
            int r9 = r8.f32422a
            r6 = r6 | r9
            r8.f32422a = r6
            r8.f32425d = r3
            r3 = 1
        L_0x02d8:
            int r6 = r13.getTextStyle()
            if (r6 <= 0) goto L_0x032a
            r3 = r6 & 1
            if (r3 == 0) goto L_0x02f0
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.assist.an r3 = (com.google.android.apps.gsa.assist.C9343an) r3
            int r8 = r3.f32422a
            r8 = r8 | r7
            r3.f32422a = r8
            r3.f32426e = r4
        L_0x02f0:
            r3 = r6 & 2
            if (r3 == 0) goto L_0x0303
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.assist.an r3 = (com.google.android.apps.gsa.assist.C9343an) r3
            int r8 = r3.f32422a
            r8 = r8 | 16
            r3.f32422a = r8
            r3.f32427f = r4
        L_0x0303:
            r3 = r6 & 4
            if (r3 == 0) goto L_0x0316
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.assist.an r3 = (com.google.android.apps.gsa.assist.C9343an) r3
            int r8 = r3.f32422a
            r8 = r8 | 32
            r3.f32422a = r8
            r3.f32428g = r4
        L_0x0316:
            r3 = r6 & 8
            if (r3 == 0) goto L_0x032c
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.assist.an r3 = (com.google.android.apps.gsa.assist.C9343an) r3
            int r6 = r3.f32422a
            r6 = r6 | 64
            r3.f32422a = r6
            r3.f32429h = r4
            goto L_0x032c
        L_0x032a:
            if (r3 == 0) goto L_0x0344
        L_0x032c:
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.assist.an r1 = (com.google.android.apps.gsa.assist.C9343an) r1
            r1.getClass()
            r3.f32457p = r1
            int r1 = r3.f32442a
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r3.f32442a = r1
        L_0x0344:
            android.os.Bundle r1 = r13.getExtras()
            r3 = 2097152(0x200000, float:2.938736E-39)
            if (r1 == 0) goto L_0x03b8
            java.lang.String r6 = "role"
            java.lang.String r6 = r1.getString(r6)
            if (r6 == 0) goto L_0x0364
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            int r8 = r7.f32442a
            r9 = 262144(0x40000, float:3.67342E-40)
            r8 = r8 | r9
            r7.f32442a = r8
            r7.f32464w = r6
        L_0x0364:
            java.lang.String r6 = "url"
            java.lang.String r6 = r1.getString(r6)
            if (r6 == 0) goto L_0x037c
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.apps.gsa.assist.ar r7 = (com.google.android.apps.gsa.assist.C9347ar) r7
            int r8 = r7.f32442a
            r9 = 1048576(0x100000, float:1.469368E-39)
            r8 = r8 | r9
            r7.f32442a = r8
            r7.f32466y = r6
        L_0x037c:
            java.lang.String r6 = "htmlTag"
            java.lang.String r6 = r1.getString(r6)
            if (r6 == 0) goto L_0x03b1
            com.google.android.apps.gsa.assist.ah r7 = com.google.android.apps.gsa.assist.C9337ah.f32395e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.assist.ae r7 = (com.google.android.apps.gsa.assist.C9334ae) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.gsa.assist.ah r8 = (com.google.android.apps.gsa.assist.C9337ah) r8
            int r9 = r8.f32397a
            r9 = r9 | r4
            r8.f32397a = r9
            r8.f32398b = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.gsa.assist.ar r6 = (com.google.android.apps.gsa.assist.C9347ar) r6
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.assist.ah r7 = (com.google.android.apps.gsa.assist.C9337ah) r7
            r7.getClass()
            r6.f32467z = r7
            int r7 = r6.f32442a
            r7 = r7 | r3
            r6.f32442a = r7
        L_0x03b1:
            java.lang.String r6 = "metadata"
            java.util.ArrayList r1 = r1.getStringArrayList(r6)
            goto L_0x03b9
        L_0x03b8:
            r1 = 0
        L_0x03b9:
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251653mq
            boolean r6 = r12.mo79746e(r6)
            if (r6 == 0) goto L_0x048c
            android.view.ViewStructure$HtmlInfo r6 = r13.getHtmlInfo()
            if (r6 == 0) goto L_0x048c
            com.google.android.apps.gsa.assist.ah r6 = com.google.android.apps.gsa.assist.C9337ah.f32395e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.assist.ae r6 = (com.google.android.apps.gsa.assist.C9334ae) r6
            android.view.ViewStructure$HtmlInfo r7 = r13.getHtmlInfo()
            if (r7 != 0) goto L_0x03dd
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.apps.gsa.assist.ah r1 = (com.google.android.apps.gsa.assist.C9337ah) r1
            goto L_0x047b
        L_0x03dd:
            java.lang.String r8 = r7.getTag()
            if (r8 == 0) goto L_0x03f8
            java.lang.String r8 = r7.getTag()
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.android.apps.gsa.assist.ah r9 = (com.google.android.apps.gsa.assist.C9337ah) r9
            r8.getClass()
            int r10 = r9.f32397a
            r10 = r10 | r4
            r9.f32397a = r10
            r9.f32398b = r8
        L_0x03f8:
            if (r1 == 0) goto L_0x0414
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.assist.ah r8 = (com.google.android.apps.gsa.assist.C9337ah) r8
            com.google.protobuf.cq r9 = r8.f32400d
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x040f
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r8.f32400d = r9
        L_0x040f:
            com.google.protobuf.cq r8 = r8.f32400d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r8)
        L_0x0414:
            java.util.List r1 = r7.getAttributes()
            if (r1 == 0) goto L_0x0475
            java.util.Iterator r1 = r1.iterator()
        L_0x041e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0475
            java.lang.Object r7 = r1.next()
            android.util.Pair r7 = (android.util.Pair) r7
            com.google.android.apps.gsa.assist.ag r8 = com.google.android.apps.gsa.assist.C9336ag.f32390d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.assist.af r8 = (com.google.android.apps.gsa.assist.C9335af) r8
            java.lang.Object r9 = r7.first
            java.lang.String r9 = (java.lang.String) r9
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.apps.gsa.assist.ag r10 = (com.google.android.apps.gsa.assist.C9336ag) r10
            r9.getClass()
            int r11 = r10.f32392a
            r11 = r11 | r4
            r10.f32392a = r11
            r10.f32393b = r9
            java.lang.Object r7 = r7.second
            java.lang.String r7 = (java.lang.String) r7
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.apps.gsa.assist.ag r9 = (com.google.android.apps.gsa.assist.C9336ag) r9
            r7.getClass()
            int r10 = r9.f32392a
            r10 = r10 | r5
            r9.f32392a = r10
            r9.f32394c = r7
            com.google.protobuf.bv r7 = r8.build()
            com.google.android.apps.gsa.assist.ag r7 = (com.google.android.apps.gsa.assist.C9336ag) r7
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.assist.ah r8 = (com.google.android.apps.gsa.assist.C9337ah) r8
            r7.getClass()
            r8.mo17543a()
            com.google.protobuf.cq r8 = r8.f32399c
            r8.add(r7)
            goto L_0x041e
        L_0x0475:
            com.google.protobuf.bv r1 = r6.build()
            com.google.android.apps.gsa.assist.ah r1 = (com.google.android.apps.gsa.assist.C9337ah) r1
        L_0x047b:
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.apps.gsa.assist.ar r5 = (com.google.android.apps.gsa.assist.C9347ar) r5
            r1.getClass()
            r5.f32467z = r1
            int r1 = r5.f32442a
            r1 = r1 | r3
            r5.f32442a = r1
        L_0x048c:
            int[] r1 = r13.getTextLineBaselines()
            if (r1 == 0) goto L_0x0499
            java.util.List r1 = com.google.common.p4575r.C60757n.m92749j(r1)
            r0.mo17540a(r1)
        L_0x0499:
            int[] r1 = r13.getTextLineCharOffsets()
            if (r1 == 0) goto L_0x04a6
            java.util.List r1 = com.google.common.p4575r.C60757n.m92749j(r1)
            r0.mo17541b(r1)
        L_0x04a6:
            android.graphics.Matrix r1 = r13.getTransformation()
            if (r1 == 0) goto L_0x04ba
            r3 = 9
            float[] r3 = new float[r3]
            r1.getValues(r3)
            java.util.List r1 = com.google.common.p4575r.C60752i.m92731e(r3)
            r0.mo17542c(r1)
        L_0x04ba:
            float r1 = r13.getElevation()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            int r5 = r3.f32442a
            r6 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r6
            r3.f32442a = r5
            r3.f32459r = r1
            float r1 = r13.getAlpha()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.gsa.assist.ar r3 = (com.google.android.apps.gsa.assist.C9347ar) r3
            int r5 = r3.f32442a
            r6 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r6
            r3.f32442a = r5
            r3.f32460s = r1
            r1 = 50
            if (r14 >= r1) goto L_0x0525
            int r1 = r13.getChildCount()
            if (r1 <= 0) goto L_0x0525
            com.google.android.apps.gsa.assist.ar[] r3 = new com.google.android.apps.gsa.assist.C9347ar[r1]
        L_0x04ef:
            if (r2 >= r1) goto L_0x0512
            android.app.assist.AssistStructure$ViewNode r5 = r13.getChildAt(r2)
            if (r5 == 0) goto L_0x0500
            int r6 = r14 + 1
            com.google.android.apps.gsa.assist.ar r5 = m167535d(r12, r5, r6)
            r3[r2] = r5
            goto L_0x050f
        L_0x0500:
            com.google.common.f.e r5 = f282651a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "ViewNode gave null child at %d."
            r7 = 13848(0x3618, float:1.9405E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56387q(r6, r2)
            int r5 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x050f:
            int r2 = r2 + 1
            goto L_0x04ef
        L_0x0512:
            java.util.List r12 = java.util.Arrays.asList(r3)
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.android.apps.gsa.assist.ar r13 = (com.google.android.apps.gsa.assist.C9347ar) r13
            r13.mo17544a()
            com.google.protobuf.cq r13 = r13.f32443b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r12, (java.util.List) r13)
        L_0x0525:
            com.google.protobuf.bv r12 = r0.build()
            com.google.android.apps.gsa.assist.ar r12 = (com.google.android.apps.gsa.assist.C9347ar) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7960g.p7961a.C101272j.m167535d(com.google.android.apps.gsa.search.core.i.t, android.app.assist.AssistStructure$ViewNode, int):com.google.android.apps.gsa.assist.ar");
    }

    /* renamed from: e */
    private static boolean m167536e(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        try {
            C58892db.m90995a(charSequence.toString());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
