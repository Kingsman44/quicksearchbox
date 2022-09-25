package com.google.android.apps.gsa.staticplugins.webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.webview.C87266l;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7030bj.C89689b;
import com.google.android.apps.gsa.shared.p7030bj.C89690c;
import com.google.android.apps.gsa.shared.p7030bj.C89691d;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p7374ag.C93823d;
import com.google.android.apps.gsa.staticplugins.webview.common.C118181b;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59752ei;
import com.google.common.p4552o.C59753ej;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ad */
/* compiled from: PG */
final class C118114ad extends C118181b {

    /* renamed from: a */
    final /* synthetic */ C118119ai f327762a;

    /* renamed from: c */
    private volatile long f327763c = 0;

    public C118114ad(C118119ai aiVar) {
        this.f327762a = aiVar;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ec A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0480 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.webkit.WebResourceResponse m196230b(android.net.Uri r18, java.lang.String r19, java.util.Map r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            java.lang.String r0 = "Google Sans:"
            java.lang.String r3 = r18.toString()
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.webview.C118119ai.f327777a
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.webview.ai r4 = r1.f327762a
            com.google.android.apps.gsa.shared.search.Query r4 = r4.mo103533f()
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            com.google.android.apps.gsa.shared.search.Query r6 = r5.mo103533f()
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo103532e()
            boolean r5 = r6.mo84383cP(r5)
            if (r5 != 0) goto L_0x0029
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            r5.mo103549w(r4)
        L_0x0029:
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            r5.mo103545s(r3, r4)
            java.lang.String r5 = "/gen_204"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L_0x0163
            android.net.Uri r5 = android.net.Uri.parse(r3)
            java.lang.String r6 = r5.getPath()
            java.lang.String r7 = "/gen_204"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0163
            java.lang.String r6 = "atyp"
            java.lang.String r6 = r5.getQueryParameter(r6)
            java.lang.String r7 = "csi"
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 == 0) goto L_0x0163
            java.lang.String r6 = "s"
            java.lang.String r6 = r5.getQueryParameter(r6)
            java.lang.String r7 = "web"
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 == 0) goto L_0x0163
            java.lang.String r6 = "t"
            java.lang.String r6 = r5.getQueryParameter(r6)
            java.lang.String r7 = "aft"
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            if (r6 != 0) goto L_0x0163
            java.lang.String r6 = "rt"
            java.lang.String r5 = r5.getQueryParameter(r6)
            if (r5 != 0) goto L_0x007a
            goto L_0x0163
        L_0x007a:
            com.google.android.apps.gsa.shared.util.aj r6 = new com.google.android.apps.gsa.shared.util.aj     // Catch:{ IllegalArgumentException -> 0x0162 }
            java.lang.String r7 = ","
            java.lang.String r8 = "\\."
            r6.<init>(r7, r8)     // Catch:{ IllegalArgumentException -> 0x0162 }
            com.google.common.b.hd r5 = r6.mo85085a(r5)     // Catch:{ IllegalArgumentException -> 0x0162 }
            com.google.android.apps.gsa.staticplugins.webview.ai r6 = r1.f327762a     // Catch:{  }
            com.google.android.apps.gsa.search.core.p.bm r6 = r6.f327829j     // Catch:{  }
            java.lang.String r7 = "qsubts"
            java.lang.Object r7 = r5.get(r7)     // Catch:{  }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{  }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{  }
            long r7 = (long) r7     // Catch:{  }
            r6.f233051b = r7     // Catch:{  }
            java.lang.String r6 = "iml"
            java.lang.Object r6 = r5.get(r6)     // Catch:{  }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{  }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{  }
            long r6 = (long) r6     // Catch:{  }
            java.lang.String r8 = "aft"
            java.lang.Object r5 = r5.get(r8)     // Catch:{  }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{  }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{  }
            long r8 = (long) r5
            long r10 = r4.f252747E
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            java.lang.Object r12 = r5.f327800S
            monitor-enter(r12)
            java.lang.String r5 = r5.f327801T     // Catch:{ all -> 0x015f }
            r13 = 0
            if (r5 != 0) goto L_0x00c3
            monitor-exit(r12)     // Catch:{ all -> 0x015f }
            goto L_0x00d7
        L_0x00c3:
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x015f }
            monitor-exit(r12)     // Catch:{ all -> 0x015f }
            java.lang.String r12 = "qsd"
            java.lang.String r5 = r5.getQueryParameter(r12)
            if (r5 != 0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x00d7 }
            long r12 = (long) r5
            r13 = r12
        L_0x00d7:
            long r10 = r10 + r13
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            com.google.android.apps.gsa.search.core.p.bm r5 = r5.f327829j
            long r12 = r5.f233051b
            long r10 = r10 + r12
            long r12 = r10 + r6
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            dagger.a r5 = r5.f327841v
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r5
            com.google.android.apps.gsa.shared.logger.b.f r6 = new com.google.android.apps.gsa.shared.logger.b.f
            r6.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_SERVER_RESPONSE_RECEIVED
            r6.f246201a = r7
            java.lang.String r7 = "rId"
            long r14 = r4.f252749G
            java.lang.String r14 = java.lang.Long.toString(r14)
            r6.mo83701c(r7, r14)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r14 = r7.toNanos(r10)
            r6.f246204d = r14
            com.google.android.apps.gsa.shared.logger.b.g r6 = r6.mo83699a()
            r5.mo74236a(r6)
            com.google.android.apps.gsa.shared.logger.b.f r6 = new com.google.android.apps.gsa.shared.logger.b.f
            r6.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_ABOVE_THE_FOLD_CONTENT_RENDERED
            r6.f246201a = r7
            java.lang.String r7 = "rId"
            long r14 = r4.f252749G
            java.lang.String r14 = java.lang.Long.toString(r14)
            r6.mo83701c(r7, r14)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r10 = r10 + r8
            long r7 = r7.toNanos(r10)
            r6.f246204d = r7
            com.google.android.apps.gsa.shared.logger.b.g r6 = r6.mo83699a()
            r5.mo74236a(r6)
            com.google.android.apps.gsa.shared.logger.b.f r6 = new com.google.android.apps.gsa.shared.logger.b.f
            r6.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r7 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.SRP_IMAGES_LOADED
            r6.f246201a = r7
            java.lang.String r7 = "rId"
            long r8 = r4.f252749G
            java.lang.String r8 = java.lang.Long.toString(r8)
            r6.mo83701c(r7, r8)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r7.toNanos(r12)
            r6.f246204d = r7
            com.google.android.apps.gsa.shared.logger.b.g r6 = r6.mo83699a()
            r5.mo74236a(r6)
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            r6 = 4
            r7 = 0
            r8 = r4
            r9 = r12
            r5.mo103544r(r6, r7, r8, r9)
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x015f }
            throw r0
        L_0x0162:
        L_0x0163:
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            com.google.android.apps.gsa.staticplugins.webview.o r5 = r5.f327782A
            java.lang.String r6 = r18.getScheme()
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x01a2
            java.lang.String r9 = "https"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0178
            goto L_0x01a2
        L_0x0178:
            java.lang.String r6 = r18.getAuthority()
            if (r6 == 0) goto L_0x01a2
            java.lang.String r9 = "www.google.com"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0187
            goto L_0x01a2
        L_0x0187:
            java.lang.String r6 = r18.getPath()
            if (r6 != 0) goto L_0x018e
            goto L_0x01a2
        L_0x018e:
            java.util.regex.Pattern r9 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328300b
            java.util.regex.Matcher r6 = r9.matcher(r6)
            boolean r9 = r6.find()
            if (r9 == 0) goto L_0x01a2
            java.lang.String r6 = r6.group(r7)
            com.google.common.base.C58893dc.m90996a(r6)
            goto L_0x01a3
        L_0x01a2:
            r6 = r8
        L_0x01a3:
            r9 = 0
            if (r6 != 0) goto L_0x01a9
        L_0x01a6:
            r0 = r8
            goto L_0x02b7
        L_0x01a9:
            com.google.android.apps.gsa.staticplugins.webview.m r10 = r5.f328302d
            java.util.Map r10 = r10.f328298a
            java.lang.Object r10 = r10.get(r6)
            com.google.protobuf.z r10 = (com.google.protobuf.C63088z) r10
            if (r10 == 0) goto L_0x01bb
            android.webkit.WebResourceResponse r0 = com.google.android.apps.gsa.staticplugins.webview.C118258o.m196417a(r10)
            goto L_0x02b7
        L_0x01bb:
            com.google.android.apps.gsa.staticplugins.webview.h r10 = r5.f328303e     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.content.Context r10 = r5.f328301c     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.os.CancellationSignal r11 = new android.os.CancellationSignal     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            androidx.core.g.g r12 = new androidx.core.g.g     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r13.<init>(r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r13.append(r6)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r0 = r13.toString()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r12.<init>(r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            androidx.core.g.n r0 = androidx.core.p095g.C1908f.m5173a(r10, r12, r11)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            int r10 = r0.f5806a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            if (r10 != 0) goto L_0x028a
            androidx.core.g.o[] r0 = r0.f5807b     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            if (r10 != 0) goto L_0x01f9
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328299a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r5 = 33742(0x83ce, float:4.7283E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r5 = "Font fetch returned zero results."
            r0.mo56386p(r5)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            goto L_0x01a6
        L_0x01f9:
            r0 = r0[r9]     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            int r10 = r0.f5812e     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            if (r10 == 0) goto L_0x0218
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328299a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r6 = 33741(0x83cd, float:4.7281E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r6 = "Returned font has failed status code %d."
            int r0 = r0.f5812e     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r5.mo56387q(r6, r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            goto L_0x01a6
        L_0x0218:
            com.google.android.apps.gsa.staticplugins.webview.h r10 = r5.f328303e     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.content.Context r10 = r5.f328301c     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.net.Uri r0 = r0.f5808a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.os.CancellationSignal r11 = new android.os.CancellationSignal     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r12 = "r"
            android.os.ParcelFileDescriptor r0 = r10.openFileDescriptor(r0, r12, r11)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            if (r0 != 0) goto L_0x0231
            r0 = r8
            goto L_0x024a
        L_0x0231:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r10.<init>(r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.nio.channels.FileChannel r11 = p3186j$.wrapper.java.p3189io.FileInputStreamWrapper.getChannel(r10)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r13 = 0
            long r15 = r11.size()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.nio.MappedByteBuffer r0 = r11.map(r12, r13, r15)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
        L_0x024a:
            if (r0 != 0) goto L_0x0264
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328299a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r5 = 33740(0x83cc, float:4.728E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r5 = "Returned file is null."
            r0.mo56386p(r5)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            goto L_0x01a6
        L_0x0264:
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328299a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.x r10 = r10.mo56226d()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r11 = 33739(0x83cb, float:4.7278E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r11)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r11 = "got the buffer: %s"
            r10.mo56389s(r11, r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96153z(r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.android.apps.gsa.staticplugins.webview.m r5 = r5.f328302d     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.util.Map r5 = r5.f328298a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r5.put(r6, r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            android.webkit.WebResourceResponse r0 = com.google.android.apps.gsa.staticplugins.webview.C118258o.m196417a(r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            goto L_0x02b7
        L_0x028a:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328299a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r6 = 33737(0x83c9, float:4.7276E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            java.lang.String r6 = "Font fetch has failed status code %d."
            int r0 = r0.f5806a     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            r5.mo56387q(r6, r0)     // Catch:{ NameNotFoundException -> 0x02a6, IOException -> 0x02a4 }
            goto L_0x01a6
        L_0x02a4:
            r0 = move-exception
            goto L_0x02a7
        L_0x02a6:
            r0 = move-exception
        L_0x02a7:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.webview.C118258o.f328299a
            com.google.common.f.x r5 = r5.mo56226d()
            java.lang.String r6 = "Failed to fetch font."
            r10 = 33738(0x83ca, float:4.7277E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r10)).mo56386p(r6)
            goto L_0x01a6
        L_0x02b7:
            if (r0 != 0) goto L_0x0480
            java.lang.String r0 = "http"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x03e9
            java.lang.String r0 = "/favicon.ico"
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x02fb
            android.net.Uri r0 = android.net.Uri.parse(r3)
            boolean r5 = r0.isRelative()
            if (r5 != 0) goto L_0x02e9
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            com.google.android.apps.gsa.search.core.google.cq r5 = r5.f327834o
            boolean r5 = r5.mo79555f(r0)
            if (r5 == 0) goto L_0x02fb
            java.lang.String r5 = "/favicon.ico"
            java.lang.String r0 = r0.getPath()
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x02fb
        L_0x02e9:
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            byte[] r6 = com.google.android.apps.gsa.staticplugins.webview.C118119ai.f327781c
            r5.<init>(r6)
            java.lang.String r6 = "image/x-icon"
            java.lang.String r7 = ""
            r0.<init>(r6, r7, r5)
            goto L_0x03ea
        L_0x02fb:
            java.lang.String r0 = "https://www.google.com/search?warmUpSW=true"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0350
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a
            com.google.android.apps.gsa.search.core.google.al r0 = r0.f327844y
            java.lang.String r0 = r0.mo79488a()
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            com.google.android.apps.gsa.search.core.google.at r5 = r5.f327845z
            java.lang.String r5 = r5.mo79492a()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            boolean r10 = r0.isEmpty()
            if (r7 != r10) goto L_0x031e
            java.lang.String r0 = "en"
        L_0x031e:
            r6[r9] = r0
            boolean r0 = r5.isEmpty()
            if (r7 == r0) goto L_0x0327
            goto L_0x0329
        L_0x0327:
            java.lang.String r5 = "US"
        L_0x0329:
            r6[r7] = r5
            java.lang.String r0 = "/serviceworker?pwa=search&hl=%s&gl=%s"
            java.lang.String r0 = java.lang.String.format(r0, r6)
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r5[r9] = r0
            java.lang.String r0 = "<!DOCTYPE html>\n<html>\n<body>\n<script>\nfunction successHandler(registrationInfo) {\n  serviceWorker = registrationInfo.installing ||\n      registrationInfo.waiting || registrationInfo.active;\n}\n\nfunction errorHandler(error, options) {\n  console.log('ServiceWorker prewarming registration failed!');\n  navigator.sendBeacon('/gen_204?atyp=sw&swe=4&registration_error='\n      + error.message + '&options=' + options);\n}\n\nvar uri = '%s';\nvar options = {\n  useCache: true,\n  updateViaCache: 'all',\n  scope: '/search'\n};\nif ('serviceWorker' in navigator) {\n  navigator.serviceWorker.register(uri, options)\n    .then(successHandler, function(error) {\n       errorHandler(error, JSON.stringify({'uri': uri, 'options': options}));    });\n}\n\n</script>\n</body>\n</html>"
            java.lang.String r0 = java.lang.String.format(r0, r5)
            android.webkit.WebResourceResponse r5 = new android.webkit.WebResourceResponse
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.getBytes()
            r6.<init>(r0)
            java.lang.String r0 = "text/html"
            java.lang.String r7 = "utf-8"
            r5.<init>(r0, r7, r6)
            r0 = r5
            goto L_0x03ea
        L_0x0350:
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a
            java.lang.Object r5 = r0.f327800S
            monitor-enter(r5)
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a     // Catch:{ all -> 0x03e6 }
            boolean r0 = r0.mo103528B(r3)     // Catch:{ all -> 0x03e6 }
            if (r0 == 0) goto L_0x0362
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a     // Catch:{ all -> 0x03e6 }
            com.google.android.apps.gsa.search.shared.api.b r0 = r0.f327802U     // Catch:{ all -> 0x03e6 }
            goto L_0x0363
        L_0x0362:
            r0 = r8
        L_0x0363:
            monitor-exit(r5)     // Catch:{ all -> 0x03e6 }
            if (r0 == 0) goto L_0x03e9
            android.webkit.WebResourceResponse r0 = r0.mo81511a()     // Catch:{ Exception -> 0x03a8 }
            if (r0 == 0) goto L_0x037f
            java.io.InputStream r5 = r0.getData()     // Catch:{ Exception -> 0x03a8 }
            com.google.android.apps.gsa.staticplugins.webview.ae r6 = new com.google.android.apps.gsa.staticplugins.webview.ae     // Catch:{ Exception -> 0x03a8 }
            com.google.android.apps.gsa.staticplugins.webview.ai r7 = r1.f327762a     // Catch:{ Exception -> 0x03a8 }
            r6.<init>(r7, r4)     // Catch:{ Exception -> 0x03a8 }
            com.google.android.apps.gsa.shared.bj.d r5 = r1.mo103515a(r3, r5, r6)     // Catch:{ Exception -> 0x03a8 }
            r0.setData(r5)     // Catch:{ Exception -> 0x03a8 }
            goto L_0x03c7
        L_0x037f:
            boolean r0 = r4.mo84436dQ()     // Catch:{ Exception -> 0x03a8 }
            if (r0 != 0) goto L_0x03c6
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.webview.C118119ai.f327777a     // Catch:{ Exception -> 0x03a8 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ Exception -> 0x03a8 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x03a8 }
            java.lang.String r6 = "GsaWebView"
            r0.mo56378ag(r5, r6)     // Catch:{ Exception -> 0x03a8 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x03a8 }
            r5 = 33757(0x83dd, float:4.7304E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ Exception -> 0x03a8 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x03a8 }
            java.lang.String r5 = "Missing headers or response: %s"
            r0.mo56389s(r5, r3)     // Catch:{ Exception -> 0x03a8 }
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a     // Catch:{ Exception -> 0x03a8 }
            r0.mo103542p(r3, r4, r8)     // Catch:{ Exception -> 0x03a8 }
            goto L_0x03c6
        L_0x03a8:
            r0 = move-exception
            if (r4 == 0) goto L_0x03b1
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            r5.mo103542p(r3, r4, r0)
            goto L_0x03c6
        L_0x03b1:
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.webview.C118119ai.f327777a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "GsaWebView"
            r5.mo56378ag(r6, r7)
            java.lang.String r6 = "Could not send exception to QueryState because query == null"
            r7 = 33758(0x83de, float:4.7305E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r7)).mo56386p(r6)
        L_0x03c6:
            r0 = r8
        L_0x03c7:
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            java.util.concurrent.atomic.AtomicReference r5 = r5.f327797P
            java.lang.Object r5 = r5.get()
            com.google.common.util.concurrent.SettableFuture r5 = (com.google.common.util.concurrent.SettableFuture) r5
            com.google.android.apps.gsa.x.c r6 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            r5.mo57356n(r6)
            com.google.android.apps.gsa.staticplugins.webview.ai r5 = r1.f327762a
            dagger.a r5 = r5.f327841v
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r5 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r5
            com.google.android.apps.gsa.shared.logger.b.ae r6 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VBUS_WEBVIEW_INJECT_RESPONSE
            r5.mo83702b(r6)
            goto L_0x03ea
        L_0x03e6:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03e6 }
            throw r0
        L_0x03e9:
            r0 = r8
        L_0x03ea:
            if (r0 == 0) goto L_0x03ed
            return r0
        L_0x03ed:
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a
            long r4 = r4.f252749G
            r0.mo103541o(r4)
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a
            com.google.android.apps.gsa.search.core.i.t r0 = r0.f327832m
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246898l
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x047f
            java.lang.String r0 = r18.getScheme()
            java.lang.String r4 = "http"
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x0414
            java.lang.String r4 = "https"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x047f
        L_0x0414:
            java.lang.String r0 = "GET"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x0434
            java.lang.String r0 = "HEAD"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x0434
            java.lang.String r0 = "POST"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x0434
            java.lang.String r0 = "PUT"
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 == 0) goto L_0x047f
        L_0x0434:
            java.lang.String r0 = r18.getHost()
            if (r0 == 0) goto L_0x0457
            java.lang.String r4 = "gstatic.com"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x044a
            java.lang.String r4 = ".gstatic.com"
            boolean r0 = r0.endsWith(r4)
            if (r0 == 0) goto L_0x0457
        L_0x044a:
            java.lang.String r0 = r18.getPath()
            java.lang.String r4 = "/video"
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x0457
            goto L_0x047f
        L_0x0457:
            com.google.android.apps.gsa.staticplugins.webview.ai r0 = r1.f327762a
            com.google.android.apps.gsa.shared.util.c.ca r4 = r0.f327837r
            dagger.a r0 = r0.f327842w
            com.google.common.util.concurrent.cx r5 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            com.google.android.apps.gsa.staticplugins.webview.eb r6 = new com.google.android.apps.gsa.staticplugins.webview.eb
            r7 = r20
            r6.<init>(r2, r3, r7, r0)
            com.google.common.util.concurrent.cx r0 = r4.mo85140e(r5, r6)
            com.google.android.apps.gsa.staticplugins.webview.cf r2 = new com.google.android.apps.gsa.staticplugins.webview.cf
            r2.<init>(r0)
            com.google.android.apps.gsa.staticplugins.webview.ea r0 = com.google.android.apps.gsa.staticplugins.webview.C118221ea.f328195a
            com.google.android.apps.gsa.shared.bj.d r0 = r1.mo103515a(r3, r2, r0)
            android.webkit.WebResourceResponse r2 = new android.webkit.WebResourceResponse
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            r2.<init>(r3, r4, r0)
            return r2
        L_0x047f:
            return r8
        L_0x0480:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.webview.C118114ad.m196230b(android.net.Uri, java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public final C89691d mo103515a(String str, InputStream inputStream, C89690c cVar) {
        C89691d dVar = new C89691d(inputStream, cVar);
        C118119ai aiVar = this.f327762a;
        synchronized (aiVar.f327807Z) {
            aiVar.f327808aa.add(new C58835az(str, dVar));
        }
        synchronized (this.f327762a.f327823d) {
            this.f327762a.f327827h = dVar;
        }
        return dVar;
    }

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        List list;
        if (!str.equals("about:blank") && !this.f327762a.mo103527A(str)) {
            Query e = this.f327762a.mo103532e();
            C118119ai aiVar = this.f327762a;
            if (aiVar.f327798Q && aiVar.mo103552z()) {
                C58976aa aaVar = C58975e.f156826a;
                aiVar.f327788G.f235736a.clearHistory();
                aiVar.mo103537k(new C118116af(14, (String) null, (Query) null, 0));
                aiVar.f327798Q = false;
            }
            C118119ai aiVar2 = this.f327762a;
            if (e.mo84416cw()) {
                ArrayDeque arrayDeque = new ArrayDeque();
                if (e.mo84416cw()) {
                    if (aiVar2.f327788G.f235736a.copyBackForwardList().getSize() > 0) {
                        aiVar2.mo103548v(arrayDeque);
                    }
                } else if (aiVar2.f327788G.f235736a.copyBackForwardList().getSize() > 1) {
                    aiVar2.mo103548v(arrayDeque);
                }
                list = new ArrayList(arrayDeque);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                Deque deque = aiVar2.f327799R;
                if (deque != null) {
                    arrayDeque2.addAll(deque);
                }
                try {
                    WebBackForwardList copyBackForwardList = aiVar2.f327788G.f235736a.copyBackForwardList();
                    if (copyBackForwardList.getSize() > 0) {
                        String str2 = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl().toString();
                        ArrayDeque arrayDeque3 = new ArrayDeque();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        while (currentIndex >= 0) {
                            int b = C118119ai.m196239b(copyBackForwardList, str2, currentIndex);
                            if (b < 0) {
                                break;
                            }
                            arrayDeque3.addFirst(copyBackForwardList.getItemAtIndex(b).getUrl());
                            currentIndex = b - 1;
                        }
                        Iterator it = arrayDeque3.iterator();
                        while (it.hasNext()) {
                            String str3 = (String) it.next();
                            Integer num = (Integer) aiVar2.f327804W.get(str3);
                            if (num == null) {
                                C58976aa aaVar2 = C58975e.f156826a;
                                num = 0;
                            }
                            int indexOf = str3.indexOf(35);
                            String substring = indexOf > 0 ? str3.substring(indexOf + 1) : BuildConfig.FLAVOR;
                            Bundle bundle = new Bundle();
                            bundle.putString("velvet:gsa_web_view_controller:substate_hash", substring);
                            bundle.putInt("velvet:gsa_web_view_controller:substate_scroll_position", num.intValue());
                            arrayDeque2.addLast(bundle);
                        }
                    }
                    list = C58485gu.m89842j(arrayDeque2);
                } catch (RuntimeException e2) {
                    C59104x d = C118119ai.f327777a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "GsaWebView");
                    ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(33784)).mo56386p("Aborting GsaWebViewController.onSaveBackstackState.");
                    ((C89911f) aiVar2.f327840u.mo27525b()).mo83755a(e2, 32736791, 29).mo83721a();
                    list = C58485gu.m89845m();
                }
            }
            if (!list.isEmpty()) {
                C118218dy c = C118219dz.m196361c();
                c.mo103514b(list);
                if (e.mo84416cw()) {
                    ((C118108a) c).f327750a = C58833ax.m90834k(this.f327762a.mo103535i());
                }
                C118219dz a = c.mo103513a();
                C87266l lVar = this.f327762a.f327838s;
                long j = e.f252749G;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArrayList("velvet:webview_history_state:webview_history", new ArrayList(a.mo103554b()));
                C58833ax a2 = a.mo103553a();
                if (a2.mo56113h()) {
                    bundle2.putString("velvet:webview_history_state:webview_restored_uri", (String) a2.mo56107c());
                }
                lVar.mo80902y(j, bundle2);
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        C59071e eVar = C118119ai.f327777a;
        C58976aa aaVar = C58975e.f156826a;
        Query e = this.f327762a.mo103532e();
        if (!str.equals("about:blank")) {
            this.f327762a.mo103544r(1, str, e, 0);
        } else {
            this.f327762a.mo103537k(new C118116af(1, "about:blank", e, 0));
            this.f327762a.f327809ab.mo57356n(C118826c.f331422a);
        }
        if (this.f327762a.mo103527A(str)) {
            this.f327762a.mo103547u(327);
        }
        this.f327762a.mo103545s(str, e);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C59071e eVar = C118119ai.f327777a;
        C58976aa aaVar = C58975e.f156826a;
        Query e = this.f327762a.mo103532e();
        if (!str.equals("about:blank")) {
            this.f327762a.mo103544r(0, str, e, 0);
        } else {
            this.f327762a.mo103537k(new C118116af(0, "about:blank", e, 0));
        }
        this.f327762a.mo103545s(str, e);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String b;
        C59071e eVar = C118119ai.f327777a;
        C58976aa aaVar = C58975e.f156826a;
        Query f = this.f327762a.mo103533f();
        int a = C89689b.m146069a(i);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 432;
        synchronized (this.f327762a.f327800S) {
            C86231bn bnVar = this.f327762a.f327803V;
            b = bnVar != null ? C39191a.m68623b(bnVar.f233052a) : BuildConfig.FLAVOR;
        }
        C59752ei eiVar = (C59752ei) C59753ej.f161449e.createBuilder();
        eiVar.copyOnWrite();
        C59753ej ejVar = (C59753ej) eiVar.instance;
        ejVar.f161451a |= 1;
        ejVar.f161452b = a;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C59753ej ejVar2 = (C59753ej) eiVar.build();
        ejVar2.getClass();
        ufVar2.f164076J = ejVar2;
        ufVar2.f164146b |= 8192;
        if (!TextUtils.isEmpty(b)) {
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar3.f164093a |= 4;
            ufVar3.f164259n = b;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        this.f327762a.mo103540n(str, f.f252749G, new C90457d(str, a));
        this.f327762a.mo103545s(str2, f);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        C59071e eVar = C118119ai.f327777a;
        C58976aa aaVar = C58975e.f156826a;
        this.f328091b.onReceivedSslError(webView, sslErrorHandler, sslError);
        C118119ai aiVar = this.f327762a;
        aiVar.mo103545s(BuildConfig.FLAVOR, aiVar.mo103533f());
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return m196230b(webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C59071e eVar = C118119ai.f327777a;
        C58976aa aaVar = C58975e.f156826a;
        Query e = this.f327762a.mo103532e();
        this.f327762a.mo103545s(str, e);
        long a = this.f327763c + this.f327762a.f327832m.mo79743a(C90120fr.f250835b);
        long j = this.f327763c;
        long j2 = this.f327762a.f327806Y;
        boolean z = true;
        if (!e.mo84416cw() && j >= j2 && this.f327762a.f327833n.mo26871c() < a) {
            C59104x d = C118119ai.f327777a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaWebView");
            ((C59052c) ((C59052c) d).mo56372aa(33771)).mo56386p("Overriding url load to let the pending navigation resolve.");
            return true;
        } else if ("about:blank".equals(str)) {
            return false;
        } else {
            if (this.f327762a.mo103528B(str)) {
                C118119ai aiVar = this.f327762a;
                aiVar.f327838s.mo80901x(aiVar.mo103532e().f252749G);
                return true;
            }
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            String scheme = parse.getScheme();
            if (webView != null && !webView.isShown() && host != null && host.startsWith("maps.google") && TextUtils.equals(scheme, "intent")) {
                return true;
            }
            if (((C93823d) this.f327762a.f327831l.mo27525b()).mo88183a(parse)) {
                this.f327762a.f327838s.mo80893p();
                return true;
            } else if ((parse.isRelative() || this.f327762a.f327834o.mo79555f(parse)) && C118119ai.f327780b.contains(parse.getPath())) {
                return false;
            } else {
                C118119ai aiVar2 = this.f327762a;
                ((C89859i) aiVar2.f327841v.mo27525b()).mo83702b(C89849ae.SRP_RESULT_CLICK);
                Query o = aiVar2.f327835p.mo79574o(e, parse.toString());
                if (o != null && e.mo84416cw() && o.mo84416cw()) {
                    z = false;
                }
                if (z) {
                    aiVar2.mo103544r(2, parse.toString(), e, 0);
                }
                this.f327763c = this.f327762a.f327833n.mo26871c();
                return z;
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return m196230b(Uri.parse(str), "GET", new HashMap());
    }
}
