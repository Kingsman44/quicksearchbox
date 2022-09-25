package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.p8889z.p8917f.C119074c;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.speech.embedded.TaggerResult;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54948af;
import com.google.p4152bb.p4153a.C54960ar;
import com.google.p4152bb.p4153a.C54976bg;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4152bb.p4153a.C55351pd;
import com.google.p4152bb.p4153a.C55421x;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import dagger.C68214a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
public class ActionData implements Parcelable, C90964a {
    public static final Parcelable.Creator CREATOR = new C87396a();

    /* renamed from: a */
    public static final AtomicLong f235990a;

    /* renamed from: b */
    public static final ActionData f235991b;

    /* renamed from: l */
    private static final C59071e f235992l = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.ActionData");

    /* renamed from: c */
    public final C55349pb f235993c;

    /* renamed from: d */
    public final TaggerResult f235994d;

    /* renamed from: e */
    public final C58179b f235995e;

    /* renamed from: f */
    public final C52091ex f235996f;

    /* renamed from: g */
    public final boolean f235997g;

    /* renamed from: h */
    public final C55421x f235998h;

    /* renamed from: i */
    public final int f235999i;

    /* renamed from: j */
    public final String f236000j;

    /* renamed from: k */
    public final int f236001k;

    /* renamed from: m */
    private final long f236002m;

    /* renamed from: n */
    private final String f236003n;

    static {
        AtomicLong atomicLong = new AtomicLong();
        f235990a = atomicLong;
        f235991b = new ActionData(atomicLong.getAndIncrement(), true, (C55349pb) null, (String) null, (TaggerResult) null, (C58179b) null, 0, (String) null, false, C55421x.UNKNOWN_ACTION_TYPE, 0, (C52091ex) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r7 != null) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r4 != 1) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        com.google.common.base.C58838bb.m90868c(r0);
        r1.f236002m = r2;
        r1.f235993c = r5;
        r1.f236003n = r6;
        r1.f235994d = r7;
        r1.f235995e = r8;
        r1.f235999i = r9;
        r1.f236000j = r10;
        r1.f235997g = r11;
        r1.f235998h = r12;
        r1.f236001k = r13;
        r1.f235996f = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionData(long r2, boolean r4, com.google.p4152bb.p4153a.C55349pb r5, java.lang.String r6, com.google.android.speech.embedded.TaggerResult r7, com.google.p4500cm.p4518d.p4519a.C58179b r8, int r9, java.lang.String r10, boolean r11, com.google.p4152bb.p4153a.C55421x r12, int r13, com.google.assistant.p3897e.p3921j.C52091ex r14) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 != 0) goto L_0x0007
            if (r7 == 0) goto L_0x0009
        L_0x0007:
            int r4 = r4 + 1
        L_0x0009:
            r0 = 1
            if (r4 != r0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            com.google.common.base.C58838bb.m90868c(r0)
            r1.f236002m = r2
            r1.f235993c = r5
            r1.f236003n = r6
            r1.f235994d = r7
            r1.f235995e = r8
            r1.f235999i = r9
            r1.f236000j = r10
            r1.f235997g = r11
            r1.f235998h = r12
            r1.f236001k = r13
            r1.f235996f = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.ActionData.<init>(long, boolean, com.google.bb.a.pb, java.lang.String, com.google.android.speech.embedded.TaggerResult, com.google.cm.d.a.b, int, java.lang.String, boolean, com.google.bb.a.x, int, com.google.assistant.e.j.ex):void");
    }

    /* renamed from: c */
    static MessageLite m141429c(Parcel parcel, C63010eb ebVar) {
        try {
            if (parcel.readByte() == 1) {
                return (MessageLite) ebVar.mo59015n(parcel.createByteArray(), C62921ba.m95368a());
            }
            return null;
        } catch (C62974ct e) {
            C59104x d = f235992l.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Velvet.ActionData");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(9532)).mo56386p("Error reading proto");
            return null;
        }
    }

    /* renamed from: o */
    public static boolean m141430o(ActionData actionData) {
        return actionData != null && actionData.f235997g;
    }

    /* renamed from: u */
    public static ActionData m141431u(C55349pb pbVar, C58179b bVar, String str, boolean z, C68214a aVar, C52091ex exVar) {
        C55421x xVar;
        C55349pb pbVar2 = pbVar;
        C58976aa aaVar = C58975e.f156826a;
        C54946ad adVar = pbVar2.f145835d.size() > 0 ? (C54946ad) pbVar2.f145835d.get(0) : null;
        if (adVar != null) {
            if ((adVar.f144533a & 16) != 0) {
                C54948af afVar = adVar.f144536d;
                if (afVar == null) {
                    afVar = C54948af.f144541h;
                }
                if ((afVar.f144543a & 1) != 0) {
                    xVar = C55421x.m87686a(afVar.f144544b);
                    if (xVar == null) {
                        xVar = C55421x.UNKNOWN_ACTION_TYPE;
                    }
                }
            }
            ((C89911f) aVar.mo27525b()).mo83755a((Throwable) null, 10632197, 29).mo83721a();
            xVar = C55421x.UNKNOWN_ACTION_TYPE;
        } else {
            xVar = C55421x.UNKNOWN_ACTION_TYPE;
        }
        return new ActionData(f235990a.getAndIncrement(), false, pbVar, (String) null, (TaggerResult) null, bVar, pbVar2.f145837f ? 1 : 0, str, z, xVar, 0, exVar);
    }

    /* renamed from: v */
    private static void m141432v(Parcel parcel, MessageLite messageLite) {
        if (messageLite == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeByteArray(messageLite.toByteArray());
    }

    /* renamed from: a */
    public final int mo81089a() {
        Object obj;
        if (this.f236001k != 0 || !mo81108t()) {
            return 0;
        }
        C54946ad s = mo81107s();
        C62940bt r1 = C62942bv.checkIsLite(C54960ar.f144579d);
        s.mo58887l(r1);
        Object l = s.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        return ((C54960ar) obj).f144582b;
    }

    /* renamed from: b */
    public final long mo81090b() {
        if (!mo81104p()) {
            return 0;
        }
        C54976bg bgVar = mo81107s().f144537e;
        if (bgVar == null) {
            bgVar = C54976bg.f144641o;
        }
        return (long) bgVar.f144645c;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo81092e() {
        if (!mo81108t()) {
            return null;
        }
        C54946ad s = mo81107s();
        C54948af afVar = s.f144536d;
        if (afVar == null) {
            afVar = C54948af.f144541h;
        }
        if ((afVar.f144543a & 64) == 0) {
            return null;
        }
        C54948af afVar2 = s.f144536d;
        if (afVar2 == null) {
            afVar2 = C54948af.f144541h;
        }
        return afVar2.f144548f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ActionData) && ((ActionData) obj).f236002m == this.f236002m;
    }

    /* renamed from: f */
    public final boolean mo81094f() {
        return !equals(f235991b);
    }

    /* renamed from: g */
    public final boolean mo81095g() {
        if (!mo81108t() || (mo81107s().f144533a & 32) == 0) {
            return true;
        }
        C54976bg bgVar = mo81107s().f144537e;
        if (bgVar == null) {
            bgVar = C54976bg.f144641o;
        }
        return bgVar.f144655m;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String str;
        fVar.mo85291r("ActionData");
        fVar.mo85279c("id").mo85276a(C90752i.m148230d(Long.valueOf(this.f236002m)));
        if (f235991b.equals(this)) {
            fVar.mo85292s(C90752i.m148229c("NONE"));
            return;
        }
        if (this.f235993c == null) {
            fVar.mo85279c("peanut").mo85276a(C90752i.m148229c("null"));
        } else {
            fVar.mo85279c("peanut").mo85276a(C90752i.m148230d(Integer.valueOf(this.f235993c.f145835d.size())));
        }
        C91005e c = fVar.mo85279c("pumpkin");
        TaggerResult taggerResult = this.f235994d;
        if (taggerResult == null) {
            str = null;
        } else {
            str = taggerResult.f118518a;
        }
        c.mo85276a(C90752i.m148229c(str));
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Metadata");
        if (this.f235995e != null) {
            e.mo85279c("is personal").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f235995e.f155544i)));
        } else {
            e.mo85292s(C90752i.m148229c((CharSequence) null));
        }
        fVar.mo85279c("effect on web results").mo85276a(C90752i.m148230d(Integer.valueOf(this.f235999i)));
        fVar.mo85279c("number of timeouts").mo85276a(C90752i.m148230d(Integer.valueOf(this.f236001k)));
    }

    /* renamed from: h */
    public final boolean mo81096h() {
        return !mo81108t() || mo81107s().f144535c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f236002m)});
    }

    /* renamed from: i */
    public final boolean mo81098i() {
        return this.f235993c == null && this.f235994d == null;
    }

    /* renamed from: j */
    public final boolean mo81099j() {
        if (this.f236001k > 0) {
            return true;
        }
        if (mo81108t()) {
            C54976bg bgVar = mo81107s().f144537e;
            if (bgVar == null) {
                bgVar = C54976bg.f144641o;
            }
            if (bgVar.f144646d) {
                return true;
            }
        }
        TaggerResult taggerResult = this.f235994d;
        if (taggerResult == null || !C119074c.m197677a(taggerResult.f118518a)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo81100k() {
        return this.f235995e != null;
    }

    /* renamed from: l */
    public final boolean mo81101l() {
        return this.f235993c != null && this.f235994d == null;
    }

    /* renamed from: m */
    public final boolean mo81102m() {
        return this.f235994d != null;
    }

    /* renamed from: n */
    public final boolean mo81103n() {
        C55349pb pbVar = this.f235993c;
        if (pbVar == null || (pbVar.f145832a & 8) == 0) {
            return false;
        }
        C55351pd pdVar = pbVar.f145834c;
        if (pdVar == null) {
            pdVar = C55351pd.f145839f;
        }
        return pdVar.f145845e;
    }

    /* renamed from: p */
    public final boolean mo81104p() {
        if (mo81108t()) {
            C54946ad s = mo81107s();
            C54976bg bgVar = s.f144537e;
            if (bgVar == null) {
                bgVar = C54976bg.f144641o;
            }
            if (bgVar.f144644b) {
                C54976bg bgVar2 = s.f144537e;
                if (bgVar2 == null) {
                    bgVar2 = C54976bg.f144641o;
                }
                if ((bgVar2.f144643a & 2) != 0) {
                    return true;
                }
            }
            return false;
        }
        TaggerResult taggerResult = this.f235994d;
        if (taggerResult == null || !taggerResult.f118518a.equals("Affirmative")) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        return true;
    }

    /* renamed from: q */
    public final boolean mo81105q() {
        TaggerResult taggerResult = this.f235994d;
        if (taggerResult != null) {
            return !"Negative".equals(taggerResult.f118518a);
        }
        if (this.f235993c == null) {
            return false;
        }
        C54946ad s = mo81108t() ? mo81107s() : null;
        if (s != null) {
            C54976bg bgVar = s.f144537e;
            if (bgVar == null) {
                bgVar = C54976bg.f144641o;
            }
            if ((bgVar.f144643a & 512) != 0) {
                C54976bg bgVar2 = s.f144537e;
                if (bgVar2 == null) {
                    bgVar2 = C54976bg.f144641o;
                }
                return bgVar2.f144652j;
            }
        }
        C55349pb pbVar = this.f235993c;
        if ((pbVar.f145832a & 8) != 0) {
            C55351pd pdVar = pbVar.f145834c;
            if (pdVar == null) {
                pdVar = C55351pd.f145839f;
            }
            if (pdVar.f145844d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final byte[] mo81106r() {
        C54946ad s;
        if (!mo81108t() || (s = mo81107s()) == null) {
            return null;
        }
        C54948af afVar = s.f144536d;
        if (afVar == null) {
            afVar = C54948af.f144541h;
        }
        if ((afVar.f144543a & 4096) == 0) {
            return null;
        }
        C54948af afVar2 = s.f144536d;
        if (afVar2 == null) {
            afVar2 = C54948af.f144541h;
        }
        return afVar2.f144549g.mo59174N();
    }

    /* renamed from: s */
    public final C54946ad mo81107s() {
        C55349pb pbVar = this.f235993c;
        if (pbVar != null) {
            return (C54946ad) pbVar.f145835d.get(0);
        }
        return null;
    }

    /* renamed from: t */
    public final boolean mo81108t() {
        C55349pb pbVar = this.f235993c;
        return pbVar != null && pbVar.f145835d.size() > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionData{id=");
        sb.append(this.f236002m);
        if (equals(f235991b)) {
            sb.append(" NONE");
        } else {
            if (this.f235993c != null) {
                sb.append(" PEANUT(ActionV2Count: ");
                sb.append(this.f235993c.f145835d.size());
                sb.append(")");
            }
            if (this.f235994d != null) {
                sb.append(" PUMPKIN(");
                sb.append(this.f235994d.f118518a);
                sb.append(")");
            }
            if (this.f235995e != null) {
                sb.append(" METADATA");
            }
        }
        sb.append(" FX=");
        sb.append(this.f235999i);
        if (this.f235997g) {
            sb.append(" TRIGGERED FROM WEB CLICK");
        }
        if (this.f236001k > 0) {
            sb.append(" timeouts=");
            sb.append(this.f236001k);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f236002m);
        m141432v(parcel, this.f235993c);
        parcel.writeString(this.f236003n);
        parcel.writeParcelable(this.f235994d, 0);
        m141432v(parcel, this.f235995e);
        parcel.writeInt(this.f235999i);
        parcel.writeString(this.f236000j);
        parcel.writeInt(this.f235998h.f146230cP);
        parcel.writeInt(this.f236001k);
    }
}
