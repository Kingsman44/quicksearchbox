package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.p096h.C1951d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2268e.p2273c.p2274a.C29840a;
import com.google.android.libraries.notifications.p2268e.p2287j.C29956g;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2309c.C30076f;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55530aj;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55581q;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55586v;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68815x;

/* renamed from: com.google.android.libraries.notifications.e.j.a.d */
/* compiled from: PG */
public final class C29941d {

    /* renamed from: a */
    public final Context f81076a;

    /* renamed from: b */
    public final C29945h f81077b;

    /* renamed from: c */
    public final C29956g f81078c;

    /* renamed from: d */
    public final C30076f f81079d;

    /* renamed from: e */
    public final C29835a f81080e;

    /* renamed from: f */
    private final C68214a f81081f;

    /* renamed from: g */
    private final C29840a f81082g;

    public C29941d(Context context, C30075e eVar, C29840a aVar, C29945h hVar, C68214a aVar2, C29956g gVar, C29835a aVar3) {
        this.f81076a = context;
        this.f81082g = aVar;
        this.f81077b = hVar;
        this.f81081f = aVar2;
        this.f81078c = gVar;
        this.f81080e = aVar3;
        this.f81079d = ((C30071a) eVar).f81358d;
    }

    /* renamed from: b */
    public static final CharSequence m55473b(String str) {
        return C68815x.f184891a.mo60497b().mo60499b() ? C1951d.m5280a(str, 63) : str;
    }

    /* renamed from: d */
    public static List m55474d(List list, C30007h hVar) {
        ArrayList arrayList = new ArrayList();
        if (hVar.mo35312f()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Bitmap bitmap = (Bitmap) ((Future) it.next()).get();
                    if (bitmap != null) {
                        arrayList.add(bitmap);
                    }
                } catch (InterruptedException e) {
                    C30058b.m55792d("NotificationBuilderHelper", e, "Failed to download image", new Object[0]);
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException e2) {
                    C30058b.m55792d("NotificationBuilderHelper", e2, "Failed to download image.", new Object[0]);
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Bitmap bitmap2 = (Bitmap) ((Future) it2.next()).get(hVar.mo35310c(), TimeUnit.MILLISECONDS);
                    if (bitmap2 != null) {
                        arrayList.add(bitmap2);
                    }
                } catch (InterruptedException e3) {
                    C30058b.m55792d("NotificationBuilderHelper", e3, "Failed to download image, remaining time: %d ms.", Long.valueOf(hVar.mo35310c()));
                    Thread.currentThread().interrupt();
                } catch (CancellationException | ExecutionException | TimeoutException e4) {
                    C30058b.m55792d("NotificationBuilderHelper", e4, "Failed to download image, remaining time: %d ms.", Long.valueOf(hVar.mo35310c()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static int m55475f(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return -1;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : -2;
        }
        return 2;
    }

    /* renamed from: a */
    public final Bitmap mo35231a(C55586v vVar, List list) {
        if (list.isEmpty()) {
            return null;
        }
        int dimensionPixelSize = this.f81076a.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
        int a = C55581q.m87712a(vVar.f146677r);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 2) {
            return C29840a.m55236c(dimensionPixelSize, list);
        }
        return this.f81082g.mo35165a(dimensionPixelSize, list);
    }

    /* renamed from: c */
    public final List mo35232c(C29820k kVar, List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55530aj ajVar = (C55530aj) it.next();
            if (!ajVar.f146538a.isEmpty() || !ajVar.f146539b.isEmpty()) {
                arrayList.add(mo35233e(kVar, ajVar.f146538a, ajVar.f146539b, i, i2));
                if (arrayList.size() >= 4) {
                    break;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC, Splitter:B:29:0x007c] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.Future mo35233e(com.google.android.libraries.notifications.data.C29820k r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0004
            r8 = 0
            goto L_0x0008
        L_0x0004:
            java.lang.String r8 = r8.mo35009h()
        L_0x0008:
            r2 = r8
            boolean r8 = r10.isEmpty()
            r0 = 1
            if (r0 == r8) goto L_0x0012
            r1 = r10
            goto L_0x0013
        L_0x0012:
            r1 = r9
        L_0x0013:
            dagger.a r8 = r7.f81081f
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.libraries.notifications.platform.g.a.a r8 = (com.google.android.libraries.notifications.platform.p2335g.p2336a.C30142a) r8
            android.net.Uri r9 = android.net.Uri.parse(r1)
            java.lang.String r10 = r9.getScheme()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0091
            java.lang.String r10 = r9.getScheme()
            int r3 = r10.hashCode()
            r4 = -368816979(0xffffffffea044cad, float:-3.9985074E25)
            r5 = 2
            if (r3 == r4) goto L_0x0056
            r4 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r3 == r4) goto L_0x004c
            r4 = 951530617(0x38b73479, float:8.735894E-5)
            if (r3 == r4) goto L_0x0042
            goto L_0x0060
        L_0x0042:
            java.lang.String r3 = "content"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x004c:
            java.lang.String r3 = "file"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0060
            r10 = 2
            goto L_0x0061
        L_0x0056:
            java.lang.String r3 = "android.resource"
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x0060
            r10 = 0
            goto L_0x0061
        L_0x0060:
            r10 = -1
        L_0x0061:
            if (r10 == 0) goto L_0x007c
            if (r10 == r0) goto L_0x0068
            if (r10 == r5) goto L_0x0068
            goto L_0x0091
        L_0x0068:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "HTTP Scheme not supported for URL: "
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.String r9 = r9.concat(r10)
            r8.<init>(r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)
            goto L_0x00b0
        L_0x007c:
            android.content.Context r8 = r8.f81517a     // Catch:{ FileNotFoundException -> 0x008b }
            java.io.InputStream r8 = com.google.android.libraries.p11029ao.p11032c.C147806g.m240908b(r8, r9)     // Catch:{ FileNotFoundException -> 0x008b }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r8)     // Catch:{ FileNotFoundException -> 0x008b }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92900i(r8)     // Catch:{ FileNotFoundException -> 0x008b }
            goto L_0x00b0
        L_0x008b:
            r8 = move-exception
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)
            goto L_0x00b0
        L_0x0091:
            com.google.android.libraries.notifications.platform.i.b.a r8 = r8.f81518b
            com.google.android.libraries.notifications.platform.f.c.a.a r9 = r8.f81521a
            com.google.android.libraries.notifications.platform.i.b.b r8 = r8.f81522b
            if (r1 == 0) goto L_0x00b1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            com.google.android.libraries.notifications.platform.g.a r10 = new com.google.android.libraries.notifications.platform.g.a
            r0 = r10
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.cx r8 = r9.mo35523a(r8, r10)
        L_0x00b0:
            return r8
        L_0x00b1:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "Null url"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2287j.p2288a.C29941d.mo35233e(com.google.android.libraries.notifications.data.k, java.lang.String, java.lang.String, int, int):java.util.concurrent.Future");
    }
}
