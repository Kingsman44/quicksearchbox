package com.google.android.apps.gsa.smartspace;

import android.graphics.Bitmap;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3820ak.C49205d;
import com.google.assistant.p3820ak.C49214m;
import com.google.assistant.p3820ak.C49215n;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53232gg;
import com.google.assistant.p3994s.p3995a.C53234gi;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.common.base.C58827ar;
import com.google.common.p4541l.C59326i;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C63042fg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.OptionalLong;

/* renamed from: com.google.android.apps.gsa.smartspace.ae */
/* compiled from: PG */
public final class C92035ae {

    /* renamed from: a */
    public final int f256572a;

    /* renamed from: b */
    public final boolean f256573b;

    /* renamed from: c */
    public final String f256574c;

    /* renamed from: d */
    public final String f256575d;

    /* renamed from: e */
    public Bitmap f256576e;

    /* renamed from: f */
    public final C92034ad f256577f;

    /* renamed from: g */
    public final String f256578g;

    /* renamed from: h */
    public final C53234gi f256579h;

    /* renamed from: i */
    public final List f256580i;

    /* renamed from: j */
    public final OptionalLong f256581j;

    /* renamed from: k */
    public final C49215n f256582k;

    /* renamed from: l */
    public C53232gg f256583l;

    /* renamed from: m */
    public int f256584m = 1;

    /* renamed from: n */
    private int f256585n = 0;

    /* renamed from: o */
    private int f256586o = 0;

    /* renamed from: p */
    private int f256587p = 0;

    /* renamed from: q */
    private int f256588q = 0;

    /* renamed from: r */
    private final List f256589r = new ArrayList();

    /* renamed from: s */
    private final List f256590s = new ArrayList();

    /* renamed from: t */
    private final List f256591t = new ArrayList();

    /* renamed from: u */
    private final List f256592u = new ArrayList();

    /* renamed from: v */
    private String f256593v = BuildConfig.FLAVOR;

    public C92035ae(int i, boolean z, String str, String str2, C92034ad adVar, String str3, C53234gi giVar, List list, OptionalLong optionalLong, int i2, C49215n nVar, C53232gg ggVar) {
        C53232gg ggVar2 = C53232gg.UNKNOWN;
        this.f256572a = i;
        this.f256573b = z;
        this.f256576e = null;
        this.f256574c = str;
        this.f256575d = str2;
        this.f256577f = adVar;
        this.f256578g = str3;
        this.f256579h = giVar;
        this.f256580i = list;
        this.f256581j = optionalLong;
        this.f256584m = i2;
        this.f256582k = nVar;
        this.f256583l = ggVar;
        if (giVar != null) {
            if ((giVar.f139525a & 1) != 0) {
                C58072d dVar = giVar.f139526b;
                this.f256585n = (dVar == null ? C58072d.f155218d : dVar).f155220a;
                C58072d dVar2 = giVar.f139526b;
                this.f256586o = (dVar2 == null ? C58072d.f155218d : dVar2).f155221b;
                this.f256587p = (dVar2 == null ? C58072d.f155218d : dVar2).f155222c;
            }
            if ((giVar.f139525a & 2) != 0) {
                this.f256588q = giVar.f139527c;
            }
            if (!giVar.f139528d.isEmpty()) {
                for (C53244gs gsVar : giVar.f139528d) {
                    if ((gsVar.f139555a & 2) != 0) {
                        this.f256589r.add(gsVar.f139557c);
                    }
                    if ((gsVar.f139555a & 64) != 0) {
                        this.f256590s.add(gsVar.f139562h);
                    }
                }
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C53230ge geVar = (C53230ge) it.next();
                if ((geVar.f139505a & 4) != 0) {
                    this.f256591t.add(geVar.f139508d);
                }
                if ((geVar.f139505a & 8) != 0) {
                    this.f256591t.add(geVar.f139509e);
                }
                if ((geVar.f139505a & 64) != 0) {
                    this.f256592u.add(geVar.f139512h);
                }
            }
        }
        if (nVar != null && nVar.f127256b.size() > 0) {
            C49214m mVar = (C49214m) nVar.f127256b.get(0);
            C49205d dVar3 = nVar.f127257c;
            String str4 = (dVar3 == null ? C49205d.f127223e : dVar3).f127226b;
            String str5 = mVar.f127249c;
            C63042fg fgVar = mVar.f127250d;
            long j = (fgVar == null ? C63042fg.f170152c : fgVar).f170154a;
            this.f256593v = str4 + str5 + j;
        }
    }

    /* renamed from: a */
    public final byte[] mo86688a() {
        C59326i iVar = C59326i.f157517e;
        int i = this.f256572a;
        String str = this.f256574c;
        boolean z = this.f256573b;
        String str2 = this.f256575d;
        String valueOf = String.valueOf(this.f256577f);
        int i2 = this.f256585n;
        int i3 = this.f256586o;
        int i4 = this.f256587p;
        int i5 = this.f256588q;
        String d = new C58827ar(",").mo56097d(this.f256589r);
        String d2 = new C58827ar(",").mo56097d(this.f256590s);
        String d3 = new C58827ar(",").mo56097d(this.f256591t);
        String d4 = new C58827ar(",").mo56097d(this.f256592u);
        String valueOf2 = String.valueOf(this.f256581j);
        C59326i iVar2 = iVar;
        int i6 = this.f256584m;
        String str3 = valueOf2;
        int i7 = i6 - 1;
        if (i6 != 0) {
            byte[] bytes = ("SmartspaceWeather{" + i + str + z + str2 + valueOf + i2 + i3 + i4 + i5 + d + d2 + d3 + d4 + str3 + i7 + this.f256593v + "}").getBytes(StandardCharsets.UTF_8);
            return iVar2.mo56837l(bytes, bytes.length).getBytes(StandardCharsets.UTF_8);
        }
        throw null;
    }
}
