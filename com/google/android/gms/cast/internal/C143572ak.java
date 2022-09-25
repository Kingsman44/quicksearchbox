package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.C143484aq;
import com.google.android.gms.cast.framework.media.C143489av;
import com.google.android.gms.cast.framework.media.C143496bb;
import com.google.android.gms.cast.framework.media.C143499be;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.cast.internal.p10776a.C143560a;
import com.google.android.gms.tasks.C146010af;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.internal.ak */
/* compiled from: PG */
public final class C143572ak extends C143576b {

    /* renamed from: e */
    public static final String f389273e = C143596v.m233271d("com.google.cast.media");

    /* renamed from: A */
    public final C143575an f389274A;

    /* renamed from: B */
    final C143575an f389275B;

    /* renamed from: C */
    public final C143575an f389276C;

    /* renamed from: D */
    public C146010af f389277D;

    /* renamed from: E */
    public C143496bb f389278E;

    /* renamed from: f */
    public long f389279f;

    /* renamed from: g */
    public MediaStatus f389280g;

    /* renamed from: h */
    public Long f389281h;

    /* renamed from: i */
    public int f389282i = -1;

    /* renamed from: j */
    public final C143575an f389283j;

    /* renamed from: k */
    public final C143575an f389284k;

    /* renamed from: l */
    public final C143575an f389285l;

    /* renamed from: m */
    public final C143575an f389286m;

    /* renamed from: n */
    public final C143575an f389287n;

    /* renamed from: o */
    public final C143575an f389288o;

    /* renamed from: p */
    public final C143575an f389289p;

    /* renamed from: q */
    public final C143575an f389290q;

    /* renamed from: r */
    final C143575an f389291r;

    /* renamed from: s */
    final C143575an f389292s;

    /* renamed from: t */
    final C143575an f389293t;

    /* renamed from: u */
    final C143575an f389294u;

    /* renamed from: v */
    public final C143575an f389295v;

    /* renamed from: w */
    final C143575an f389296w;

    /* renamed from: x */
    public final C143575an f389297x;

    /* renamed from: y */
    public final C143575an f389298y;

    /* renamed from: z */
    public final C143575an f389299z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143572ak() {
        super(f389273e);
        C143575an anVar = new C143575an(86400000);
        this.f389283j = anVar;
        C143575an anVar2 = new C143575an(86400000);
        this.f389284k = anVar2;
        C143575an anVar3 = new C143575an(86400000);
        this.f389285l = anVar3;
        C143575an anVar4 = new C143575an(86400000);
        this.f389286m = anVar4;
        C143575an anVar5 = new C143575an(10000);
        this.f389287n = anVar5;
        C143575an anVar6 = new C143575an(86400000);
        this.f389288o = anVar6;
        C143575an anVar7 = new C143575an(86400000);
        this.f389289p = anVar7;
        C143575an anVar8 = new C143575an(86400000);
        this.f389290q = anVar8;
        C143575an anVar9 = new C143575an(86400000);
        this.f389291r = anVar9;
        C143575an anVar10 = new C143575an(86400000);
        this.f389292s = anVar10;
        C143575an anVar11 = new C143575an(86400000);
        this.f389293t = anVar11;
        C143575an anVar12 = new C143575an(86400000);
        this.f389294u = anVar12;
        C143575an anVar13 = new C143575an(86400000);
        this.f389295v = anVar13;
        C143575an anVar14 = anVar13;
        C143575an anVar15 = new C143575an(86400000);
        this.f389296w = anVar15;
        C143575an anVar16 = anVar15;
        C143575an anVar17 = new C143575an(86400000);
        this.f389297x = anVar17;
        C143575an anVar18 = anVar17;
        C143575an anVar19 = new C143575an(86400000);
        this.f389299z = anVar19;
        C143575an anVar20 = anVar19;
        this.f389298y = new C143575an(86400000);
        C143575an anVar21 = new C143575an(86400000);
        this.f389274A = anVar21;
        C143575an anVar22 = anVar21;
        C143575an anVar23 = new C143575an(86400000);
        this.f389275B = anVar23;
        C143575an anVar24 = anVar23;
        C143575an anVar25 = new C143575an(86400000);
        this.f389276C = anVar25;
        mo118911b(anVar);
        mo118911b(anVar2);
        mo118911b(anVar3);
        mo118911b(anVar4);
        mo118911b(anVar5);
        mo118911b(anVar6);
        mo118911b(anVar7);
        mo118911b(anVar8);
        mo118911b(anVar9);
        mo118911b(anVar10);
        mo118911b(anVar11);
        mo118911b(anVar12);
        mo118911b(anVar14);
        mo118911b(anVar16);
        mo118911b(anVar18);
        C143575an anVar26 = anVar20;
        mo118911b(anVar26);
        mo118911b(anVar26);
        mo118911b(anVar22);
        mo118911b(anVar24);
        mo118911b(anVar25);
        mo118896j();
    }

    /* renamed from: i */
    public static C143571aj m233188i(JSONObject jSONObject) {
        MediaError.m232558a(jSONObject);
        C143571aj ajVar = new C143571aj();
        C143596v.m233276i(jSONObject, "customData");
        return ajVar;
    }

    /* renamed from: q */
    public static int[] m233189q(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    /* renamed from: e */
    public final long mo118892e(double d, long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f389279f;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        double d2 = (double) elapsedRealtime;
        Double.isNaN(d2);
        long j3 = j + ((long) (d2 * d));
        if (j2 > 0 && j3 > j2) {
            return j2;
        }
        if (j3 >= 0) {
            return j3;
        }
        return 0;
    }

    /* renamed from: f */
    public final long mo118893f() {
        MediaStatus mediaStatus = this.f389280g;
        if (mediaStatus != null) {
            return mediaStatus.f388700b;
        }
        throw new C143570ai();
    }

    /* renamed from: g */
    public final long mo118894g() {
        MediaInfo h = mo118895h();
        if (h != null) {
            return h.f388638e;
        }
        return 0;
    }

    /* renamed from: h */
    public final MediaInfo mo118895h() {
        MediaStatus mediaStatus = this.f389280g;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.f388699a;
    }

    /* renamed from: j */
    public final void mo118896j() {
        this.f389279f = 0;
        this.f389280g = null;
        for (C143575an d : this.f389308a) {
            d.mo118908d(2002);
        }
    }

    /* renamed from: k */
    public final void mo118897k(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f389282i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.f389318b.mo118889g(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    /* renamed from: l */
    public final void mo118898l() {
        C143496bb bbVar = this.f389278E;
        if (bbVar != null) {
            for (C143489av b : bbVar.f389119a.f389131f) {
                b.mo118748b();
            }
            for (C143484aq b2 : bbVar.f389119a.f389132g) {
                b2.mo6033b();
            }
        }
    }

    /* renamed from: m */
    public final void mo118899m() {
        C143496bb bbVar = this.f389278E;
        if (bbVar != null) {
            for (C143489av c : bbVar.f389119a.f389131f) {
                c.mo118749c();
            }
            for (C143484aq c2 : bbVar.f389119a.f389132g) {
                c2.mo6034c();
            }
        }
    }

    /* renamed from: n */
    public final void mo118900n() {
        C143496bb bbVar = this.f389278E;
        if (bbVar != null) {
            for (C143489av d : bbVar.f389119a.f389131f) {
                d.mo118750d();
            }
            for (C143484aq e : bbVar.f389119a.f389132g) {
                e.mo6036e();
            }
        }
    }

    /* renamed from: o */
    public final void mo118901o() {
        C143496bb bbVar = this.f389278E;
        if (bbVar != null) {
            C143500bf bfVar = bbVar.f389119a;
            for (C143499be beVar : bfVar.f389134i.values()) {
                if (bfVar.mo118793u() && !beVar.f389123c) {
                    beVar.mo118760a();
                } else if (!bfVar.mo118793u() && beVar.f389123c) {
                    beVar.mo118761b();
                }
                if (beVar.f389123c && (bfVar.mo118794v() || bfVar.mo118796x() || bfVar.mo118798z() || bfVar.mo118797y())) {
                    bfVar.mo118791s(beVar.f389121a);
                }
            }
            for (C143489av f : bbVar.f389119a.f389131f) {
                f.mo118752f();
            }
            for (C143484aq p : bbVar.f389119a.f389132g) {
                p.mo6047p();
            }
        }
    }

    /* renamed from: p */
    public final boolean mo118902p() {
        return this.f389282i != -1;
    }

    /* renamed from: r */
    public final void mo118903r(C143573al alVar, int i, long j, int i2, Integer num) {
        if (j == -1 || j >= 0) {
            JSONObject jSONObject = new JSONObject();
            long c = mo118916c();
            try {
                jSONObject.put("requestId", c);
                jSONObject.put("type", "QUEUE_UPDATE");
                jSONObject.put("mediaSessionId", mo118893f());
                if (i != 0) {
                    jSONObject.put("currentItemId", i);
                }
                if (i2 != 0) {
                    jSONObject.put("jump", i2);
                }
                String b = C143560a.m233152b(num);
                if (b != null) {
                    jSONObject.put("repeatMode", b);
                }
                if (j != -1) {
                    jSONObject.put("currentTime", C143596v.m233268a(j));
                }
                if (mo118902p()) {
                    jSONObject.put("sequenceNumber", this.f389282i);
                }
            } catch (JSONException unused) {
            }
            mo118917d(jSONObject.toString(), c);
            this.f389294u.mo118905a(c, new C143569ah(this, alVar));
            return;
        }
        throw new IllegalArgumentException("playPosition cannot be negative: " + j);
    }
}
