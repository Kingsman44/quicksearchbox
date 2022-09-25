package com.google.android.libraries.elements.p1714d.p1715a;

import com.google.android.libraries.elements.interfaces.C21308o;
import com.google.android.libraries.elements.interfaces.DataSourceDelegate;
import com.google.android.libraries.elements.interfaces.DataSourceListener;
import com.google.android.libraries.elements.internal.C21357r;
import com.youtube.android.libraries.elements.StatusOr;
import java.util.ArrayList;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.elements.d.a.a */
/* compiled from: PG */
public final class C20776a extends C21308o {

    /* renamed from: a */
    public final DataSourceDelegate f58125a;

    /* renamed from: b */
    public final boolean f58126b;

    /* renamed from: c */
    public final C21357r f58127c;

    /* renamed from: d */
    private final C20779d f58128d;

    /* renamed from: e */
    private final int f58129e;

    /* renamed from: f */
    private final boolean f58130f;

    /* renamed from: a */
    public final int mo25855a() {
        return this.f58129e;
    }

    /* renamed from: b */
    public final void mo25856b(DataSourceListener dataSourceListener) {
        this.f58128d.mo25867a(dataSourceListener);
    }

    /* renamed from: c */
    public final boolean mo25857c() {
        return this.f58130f;
    }

    public final void dispose() {
        this.f58128d.mo25868b();
        this.f58125a.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final StatusOr elementAtIndex(int i) {
        return this.f58125a.elementAtIndex(i);
    }

    public final ArrayList identifiers() {
        return this.f58125a.identifiers();
    }

    public final Status loadMore() {
        return this.f58125a.loadMore();
    }

    public final Status moveItem(int i, int i2) {
        return this.f58125a.moveItem(i, i2);
    }

    public final Status reload() {
        return this.f58125a.reload();
    }

    public final Status removeItem(int i) {
        return this.f58125a.removeItem(i);
    }

    public final int size() {
        return this.f58125a.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.elements.internal.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.youtube.a.a.ag} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20776a(com.google.android.libraries.elements.internal.C21359t r4, com.google.android.libraries.elements.interfaces.C21319z r5, com.google.android.libraries.elements.interfaces.DataSourceDelegate r6, com.google.android.libraries.elements.p1714d.p1715a.C20779d r7, com.youtube.p5283a.p5284a.C68065ba r8, com.youtube.p5283a.p5284a.C68103y r9, com.youtube.p5283a.p5284a.C68068bd r10) {
        /*
            r3 = this;
            r3.<init>()
            r3.f58125a = r6
            r3.f58128d = r7
            r6 = 4
            r7 = 0
            if (r8 != 0) goto L_0x000d
            r8 = -1
            goto L_0x001e
        L_0x000d:
            int r0 = r8.mo16913a(r6)
            if (r0 == 0) goto L_0x001d
            java.nio.ByteBuffer r1 = r8.f24704b
            int r8 = r8.f24703a
            int r0 = r0 + r8
            int r8 = r1.getInt(r0)
            goto L_0x001e
        L_0x001d:
            r8 = 0
        L_0x001e:
            r3.f58129e = r8
            r8 = 1
            if (r9 == 0) goto L_0x0036
            int r0 = r9.mo16913a(r6)
            if (r0 == 0) goto L_0x0036
            java.nio.ByteBuffer r1 = r9.f24704b
            int r2 = r9.f24703a
            int r0 = r0 + r2
            byte r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r3.f58126b = r0
            r0 = 0
            if (r9 == 0) goto L_0x005c
            com.youtube.a.a.ag r1 = new com.youtube.a.a.ag
            r1.<init>()
            r2 = 6
            int r2 = r9.mo16913a(r2)
            if (r2 == 0) goto L_0x0058
            int r0 = r9.f24703a
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r9.f24704b
            int r0 = r0.getInt(r2)
            int r2 = r2 + r0
            java.nio.ByteBuffer r9 = r9.f24704b
            r1.mo16917e(r2, r9)
            r0 = r1
        L_0x0058:
            com.google.android.libraries.elements.internal.r r0 = r4.mo26863g(r0, r5)
        L_0x005c:
            r3.f58127c = r0
            if (r10 == 0) goto L_0x0072
            int r4 = r10.mo16913a(r6)
            if (r4 == 0) goto L_0x0072
            java.nio.ByteBuffer r5 = r10.f24704b
            int r6 = r10.f24703a
            int r4 = r4 + r6
            byte r4 = r5.get(r4)
            if (r4 == 0) goto L_0x0072
            r7 = 1
        L_0x0072:
            r3.f58130f = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.p1715a.C20776a.<init>(com.google.android.libraries.elements.internal.t, com.google.android.libraries.elements.interfaces.z, com.google.android.libraries.elements.interfaces.DataSourceDelegate, com.google.android.libraries.elements.d.a.d, com.youtube.a.a.ba, com.youtube.a.a.y, com.youtube.a.a.bd):void");
    }
}
