package com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c;

import com.google.android.libraries.search.rendering.xuikit.bubbles.C40101b;
import com.google.common.p4522b.C58495hd;
import com.google.p4283bv.p4287b.p4342b.C56943g;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.c.b */
/* compiled from: PG */
public final class C40109b extends C40112e {

    /* renamed from: a */
    public C40111d f105350a;

    /* renamed from: b */
    public C56943g f105351b;

    /* renamed from: c */
    public C58495hd f105352c;

    /* renamed from: d */
    private int f105353d;

    /* renamed from: e */
    private int f105354e;

    /* renamed from: f */
    private C40101b f105355f;

    /* renamed from: g */
    private byte f105356g;

    public C40109b() {
    }

    public C40109b(C40113f fVar) {
        C40110c cVar = (C40110c) fVar;
        this.f105350a = cVar.f105357a;
        this.f105351b = cVar.f105358b;
        this.f105352c = cVar.f105359c;
        this.f105353d = cVar.f105360d;
        this.f105354e = cVar.f105361e;
        this.f105355f = cVar.f105362f;
        this.f105356g = 3;
    }

    /* renamed from: a */
    public final C40113f mo42188a() {
        C40111d dVar;
        C56943g gVar;
        C58495hd hdVar;
        C40101b bVar;
        if (this.f105356g == 3 && (dVar = this.f105350a) != null && (gVar = this.f105351b) != null && (hdVar = this.f105352c) != null && (bVar = this.f105355f) != null) {
            return new C40110c(dVar, gVar, hdVar, this.f105353d, this.f105354e, bVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f105350a == null) {
            sb.append(" bubbleId");
        }
        if (this.f105351b == null) {
            sb.append(" bubbleXBlendAddress");
        }
        if (this.f105352c == null) {
            sb.append(" queryParameters");
        }
        if ((this.f105356g & 1) == 0) {
            sb.append(" layoutDirection");
        }
        if ((this.f105356g & 2) == 0) {
            sb.append(" triggerSourceVeId");
        }
        if (this.f105355f == null) {
            sb.append(" bubbleContainerConfig");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo42189b(C40101b bVar) {
        if (bVar != null) {
            this.f105355f = bVar;
            return;
        }
        throw new NullPointerException("Null bubbleContainerConfig");
    }

    /* renamed from: c */
    public final void mo42190c(int i) {
        this.f105353d = i;
        this.f105356g = (byte) (this.f105356g | 1);
    }

    /* renamed from: d */
    public final void mo42191d(int i) {
        this.f105354e = i;
        this.f105356g = (byte) (this.f105356g | 2);
    }
}
