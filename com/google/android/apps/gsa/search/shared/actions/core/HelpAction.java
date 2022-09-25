package com.google.android.apps.gsa.search.shared.actions.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.contacts.example.ExampleContact;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C54971bb;
import com.google.p4152bb.p4153a.C54972bc;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class HelpAction extends NewVisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87404c();

    /* renamed from: k */
    private static final C59071e f236044k = C59071e.m91332i("com.google.android.apps.gsa.search.shared.actions.core.HelpAction");

    /* renamed from: f */
    public final String f236045f;

    /* renamed from: g */
    public final List f236046g;

    /* renamed from: h */
    public final Map f236047h;

    /* renamed from: i */
    public final String f236048i;

    /* renamed from: j */
    public final int f236049j;

    protected HelpAction(Parcel parcel) {
        super(parcel);
        this.f236045f = parcel.readString();
        if (parcel.readByte() == 1) {
            this.f236048i = parcel.readString();
            C87405d.m141567a();
            int readInt = parcel.readInt();
            if (readInt < 0 || readInt >= 4) {
                ((C59052c) ((C59052c) f236044k.mo56226d()).mo56372aa(9537)).mo56386p("read introduction with unrecognized HelpActionType.");
                int i = C90755l.f253831a;
                this.f236049j = 4;
            } else {
                this.f236049j = C87405d.m141567a()[readInt];
            }
            this.f236046g = null;
            this.f236047h = null;
            return;
        }
        this.f236048i = null;
        this.f236049j = 4;
        int readInt2 = parcel.readInt();
        this.f236046g = C58597ky.m90213d(readInt2);
        int i2 = 0;
        while (i2 < readInt2) {
            try {
                byte[] createByteArray = parcel.createByteArray();
                this.f236046g.add((C54972bc) C62942bv.parseFrom((C62942bv) C54972bc.f144609t, createByteArray));
                i2++;
            } catch (C62974ct e) {
                e.printStackTrace();
            }
        }
        int readInt3 = parcel.readInt();
        this.f236047h = C58662ni.m90351j(readInt3);
        for (int i3 = 0; i3 < readInt3; i3++) {
            ArrayList arrayList = new ArrayList();
            int readInt4 = parcel.readInt();
            parcel.readTypedList(arrayList, ExampleContact.CREATOR);
            this.f236047h.put(Integer.valueOf(readInt4), arrayList);
        }
    }

    /* renamed from: N */
    public static int m141541N(C54972bc bcVar) {
        Iterator it = new C62963cj(bcVar.f144617h, C54972bc.f144607i).iterator();
        if (!it.hasNext()) {
            return 0;
        }
        C54971bb bbVar = C54971bb.DATE_DAY;
        int ordinal = ((C54971bb) it.next()).ordinal();
        if (ordinal != 3) {
            return ordinal != 4 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81163h(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return false;
    }

    /* renamed from: f */
    public final MatchingProviderInfo mo81065f() {
        return C87489k.m142013a();
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.HELP;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f236045f);
        if (this.f236046g == null || this.f236047h == null) {
            parcel.writeByte((byte) 1);
            parcel.writeString(this.f236048i);
            int i2 = this.f236049j;
            int i3 = i2 - 1;
            if (i2 != 0) {
                parcel.writeInt(i3);
                return;
            }
            throw null;
        }
        parcel.writeByte((byte) 0);
        parcel.writeInt(this.f236046g.size());
        for (C54972bc byteArray : this.f236046g) {
            parcel.writeByteArray(byteArray.toByteArray());
        }
        parcel.writeInt(this.f236047h.size());
        for (Map.Entry entry : this.f236047h.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeTypedList((List) entry.getValue());
        }
    }

    public HelpAction(String str, String str2, int i) {
        this.f236046g = null;
        this.f236047h = null;
        this.f236045f = str;
        this.f236048i = str2;
        this.f236049j = i;
    }

    public HelpAction(String str, List list, Map map) {
        this.f236046g = list;
        this.f236047h = map;
        this.f236045f = str;
        this.f236048i = null;
        this.f236049j = 4;
        C58838bb.m90883r(!list.isEmpty());
        for (List isEmpty : map.values()) {
            C58838bb.m90883r(!isEmpty.isEmpty());
        }
    }
}
