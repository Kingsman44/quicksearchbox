package com.google.android.apps.gsa.search.shared.actions.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4575r.C60757n;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55191jf;
import com.google.p4152bb.p4153a.C55192jg;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p5277z.p5282c.C68036z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class CardDecision implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87479a();

    /* renamed from: a */
    public static final CardDecision f236247a = new CardDecision((String) null, (TtsRequest) null, (List) null, false, false, false, false, false, false, 0, C54944ab.UNKNOWN, C54944ab.UNKNOWN, C58485gu.m89846n(-1), (C68036z) null, (C55263lx) null, false, (List) null, false, false, false);

    /* renamed from: b */
    public static final CardDecision f236248b;

    /* renamed from: c */
    public final String f236249c;

    /* renamed from: d */
    public final TtsRequest f236250d;

    /* renamed from: e */
    public final List f236251e;

    /* renamed from: f */
    public final boolean f236252f;

    /* renamed from: g */
    public final boolean f236253g;

    /* renamed from: h */
    public final boolean f236254h;

    /* renamed from: i */
    public final boolean f236255i;

    /* renamed from: j */
    public final boolean f236256j;

    /* renamed from: k */
    public final long f236257k;

    /* renamed from: l */
    public final boolean f236258l;

    /* renamed from: m */
    public final int f236259m;

    /* renamed from: n */
    public final int f236260n;

    /* renamed from: o */
    public final List f236261o;

    /* renamed from: p */
    public final C68036z f236262p;

    /* renamed from: q */
    public final C55263lx f236263q;

    /* renamed from: r */
    public final boolean f236264r;

    /* renamed from: s */
    public final boolean f236265s;

    /* renamed from: t */
    public final List f236266t;

    /* renamed from: u */
    public final boolean f236267u;

    /* renamed from: v */
    public final boolean f236268v;

    static {
        C54944ab abVar = C54944ab.UNKNOWN;
        f236248b = new CardDecision((String) null, (TtsRequest) null, (List) null, false, false, false, true, false, false, 0, abVar, abVar, C58485gu.m89846n(-1), (C68036z) null, (C55263lx) null, false, (List) null, false, false, false);
    }

    public CardDecision(String str, TtsRequest ttsRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, long j, C54944ab abVar, C54944ab abVar2, List list2, C68036z zVar, C55263lx lxVar, boolean z7, List list3, boolean z8, boolean z9, boolean z10) {
        this.f236249c = str;
        this.f236250d = ttsRequest;
        this.f236251e = list;
        this.f236252f = z;
        this.f236253g = z2;
        this.f236254h = z3;
        this.f236258l = z4;
        this.f236255i = z5;
        this.f236256j = z6;
        this.f236257k = j;
        this.f236259m = abVar.f144530R;
        this.f236260n = abVar2.f144530R;
        this.f236261o = list2;
        this.f236262p = zVar;
        this.f236263q = lxVar;
        this.f236264r = z7;
        this.f236266t = list3 != null ? list3 : new ArrayList();
        this.f236265s = z8;
        this.f236267u = z9;
        this.f236268v = z10;
    }

    /* renamed from: b */
    public static C87480b m141963b(String str, TtsRequest ttsRequest, C54944ab abVar) {
        C87480b bVar = new C87480b();
        bVar.mo81466h(str, abVar);
        bVar.mo81467i(ttsRequest, abVar);
        return bVar;
    }

    /* renamed from: c */
    public static C87480b m141964c(String str, C54944ab abVar) {
        C87480b bVar = new C87480b();
        bVar.mo81466h(str, abVar);
        return bVar;
    }

    /* renamed from: f */
    public static List m141965f(Parcel parcel, Class cls) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, cls.getClassLoader());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo81417a() {
        if (!this.f236261o.isEmpty()) {
            return ((Integer) this.f236261o.get(0)).intValue();
        }
        return -1;
    }

    /* renamed from: d */
    public final CardDecision mo81418d() {
        String str = this.f236249c;
        List list = this.f236251e;
        boolean z = this.f236253g;
        boolean z2 = this.f236254h;
        boolean z3 = this.f236258l;
        boolean z4 = this.f236255i;
        boolean z5 = this.f236256j;
        long j = this.f236257k;
        C54944ab abVar = (C54944ab) C58833ax.m90833j(C54944ab.m87544a(this.f236259m)).mo56109e(C54944ab.UNKNOWN);
        C54944ab abVar2 = (C54944ab) C58833ax.m90833j(C54944ab.m87544a(this.f236260n)).mo56109e(C54944ab.UNKNOWN);
        List list2 = this.f236261o;
        C68036z zVar = this.f236262p;
        C55263lx lxVar = this.f236263q;
        boolean z6 = this.f236264r;
        C68036z zVar2 = zVar;
        List list3 = this.f236266t;
        C55263lx lxVar2 = lxVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            PromptSegment promptSegment = (PromptSegment) it.next();
            arrayList.add(new PromptSegment(promptSegment.f236271a, (TtsRequest) null, promptSegment.f236273c, promptSegment.f236274d));
            z6 = z6;
            it = it2;
            list2 = list2;
            abVar2 = abVar2;
            abVar = abVar;
        }
        C54944ab abVar3 = abVar;
        C54944ab abVar4 = abVar2;
        List list4 = list2;
        return new CardDecision(str, (TtsRequest) null, list, false, z, z2, z3, z4, z5, j, abVar, abVar2, list2, zVar2, lxVar2, z6, arrayList, this.f236265s, this.f236267u, this.f236268v);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final PromptSegment mo81420e(int i) {
        if (i < 0 || this.f236266t.size() <= i) {
            return null;
        }
        return (PromptSegment) this.f236266t.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CardDecision cardDecision = (CardDecision) obj;
            return this.f236257k == cardDecision.f236257k && this.f236258l == cardDecision.f236258l && this.f236252f == cardDecision.f236252f && C58832aw.m90831a(this.f236261o, cardDecision.f236261o) && this.f236259m == cardDecision.f236259m && this.f236260n == cardDecision.f236260n && this.f236255i == cardDecision.f236255i && this.f236256j == cardDecision.f236256j && this.f236254h == cardDecision.f236254h && this.f236253g == cardDecision.f236253g && TextUtils.equals(this.f236249c, cardDecision.f236249c) && C58832aw.m90831a(this.f236250d, cardDecision.f236250d) && C58832aw.m90831a(this.f236263q, cardDecision.f236263q) && C58832aw.m90831a(this.f236251e, cardDecision.f236251e) && this.f236264r == cardDecision.f236264r && C58832aw.m90831a(this.f236266t, cardDecision.f236266t) && this.f236265s == cardDecision.f236265s && this.f236267u == cardDecision.f236267u && this.f236268v == cardDecision.f236268v;
        }
    }

    /* renamed from: g */
    public final boolean mo81422g() {
        return this.f236261o.size() > 1;
    }

    /* renamed from: h */
    public final boolean mo81423h() {
        if (this.f236261o.isEmpty() || ((Integer) this.f236261o.get(0)).intValue() == -1) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f236249c, this.f236250d, this.f236251e, Boolean.valueOf(this.f236252f), Boolean.valueOf(this.f236253g), Boolean.valueOf(this.f236254h), Boolean.valueOf(this.f236255i), Boolean.valueOf(this.f236256j), Long.valueOf(this.f236257k), Boolean.valueOf(this.f236258l), Integer.valueOf(this.f236259m), Integer.valueOf(this.f236260n), this.f236261o, this.f236263q, Boolean.valueOf(this.f236264r), this.f236266t, Boolean.valueOf(this.f236265s), Boolean.valueOf(this.f236267u), Boolean.valueOf(this.f236268v)});
    }

    /* renamed from: i */
    public final boolean mo81425i() {
        C55263lx lxVar = this.f236263q;
        if (lxVar == null) {
            return false;
        }
        C55192jg jgVar = lxVar.f145553h;
        if (jgVar == null) {
            jgVar = C55192jg.f145274b;
        }
        int a = C55191jf.m87619a(jgVar.f145276a);
        return a != 0 && a == 5;
    }

    public final String toString() {
        if (equals(f236248b)) {
            return "CardDecision[SUPPRESS_NETWORK_DECISION]";
        }
        if (equals(f236247a)) {
            return "CardDecision[NETWORK_DECISION]";
        }
        boolean z = this.f236258l;
        boolean z2 = this.f236254h;
        boolean z3 = this.f236255i;
        boolean z4 = this.f236256j;
        boolean z5 = this.f236252f;
        String obj = C90752i.m148233g(this.f236249c).toString();
        String obj2 = C90752i.m148234h(this.f236250d).toString();
        String valueOf = String.valueOf(this.f236251e);
        int i = this.f236259m;
        int i2 = this.f236260n;
        String valueOf2 = String.valueOf(this.f236261o);
        long j = this.f236257k;
        String valueOf3 = String.valueOf(this.f236262p);
        String valueOf4 = String.valueOf(this.f236263q);
        boolean z6 = this.f236264r;
        String obj3 = this.f236266t.toString();
        boolean z7 = this.f236265s;
        boolean z8 = this.f236267u;
        return "CardDecision[OverrideNetworkPrompt: " + z + ", StartFollowOnVoiceSearch: " + z2 + ", ShouldAutoExecute: " + z3 + ", ShouldCancel: " + z4 + ", PlayTts: " + z5 + ", DisplayPrompt: " + obj + ", VocalizedPrompt: " + obj2 + ", Suggestions: " + valueOf + ", PromptedField: " + i + ", SubStatePromptedField: " + i2 + ", PromptedArgumentId: " + valueOf2 + ", CountdownDuration: " + j + ", PresentedDialogTurnIntent" + valueOf3 + ", ModalState: " + valueOf4 + ", RequiresUserAuth: " + z6 + ", PromptSegments: " + obj3 + ", isFirstTimePrompted: " + z7 + ", ShouldRemoveClientGeneratedSuggestionChip: " + z8 + ", ShouldFocusOnCard: " + this.f236268v + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f236249c);
        parcel.writeParcelable(this.f236250d, 0);
        parcel.writeList(this.f236251e);
        parcel.writeByte(this.f236252f ? (byte) 1 : 0);
        parcel.writeByte(this.f236253g ? (byte) 1 : 0);
        parcel.writeByte(this.f236254h ? (byte) 1 : 0);
        parcel.writeByte(this.f236258l ? (byte) 1 : 0);
        parcel.writeByte(this.f236255i ? (byte) 1 : 0);
        parcel.writeByte(this.f236256j ? (byte) 1 : 0);
        parcel.writeLong(this.f236257k);
        parcel.writeInt(this.f236259m);
        parcel.writeInt(this.f236260n);
        parcel.writeIntArray(C60757n.m92752m(this.f236261o));
        C55263lx lxVar = this.f236263q;
        parcel.writeByteArray(lxVar != null ? lxVar.toByteArray() : null);
        parcel.writeByte(this.f236264r ? (byte) 1 : 0);
        parcel.writeList(this.f236266t);
        parcel.writeByte(this.f236265s ? (byte) 1 : 0);
        parcel.writeByte(this.f236267u ? (byte) 1 : 0);
        parcel.writeByte(this.f236268v ? (byte) 1 : 0);
    }
}
