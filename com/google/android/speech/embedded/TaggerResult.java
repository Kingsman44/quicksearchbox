package com.google.android.speech.embedded;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60527te;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.speech.grammar.pumpkin.C66521m;
import com.google.speech.grammar.pumpkin.C66525q;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class TaggerResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45343a();

    /* renamed from: d */
    private static final C59071e f118517d = C59071e.m91332i("com.google.android.speech.embedded.TaggerResult");

    /* renamed from: a */
    public final String f118518a;

    /* renamed from: b */
    public final C60527te f118519b;

    /* renamed from: c */
    public final C66525q f118520c;

    /* renamed from: e */
    private final Map f118521e = new HashMap();

    /* renamed from: f */
    private final Map f118522f = new HashMap();

    public TaggerResult(Parcel parcel) {
        this.f118518a = parcel.readString();
        Bundle readBundle = parcel.readBundle();
        for (String str : readBundle.keySet()) {
            this.f118521e.put(str, readBundle.getString(str));
        }
        Bundle readBundle2 = parcel.readBundle();
        for (String str2 : readBundle2.keySet()) {
            this.f118522f.put(str2, readBundle2.getString(str2));
        }
        C60527te teVar = C60527te.f163903c;
        try {
            teVar = (C60527te) C62942bv.parseFrom((C62942bv) C60527te.f163903c, parcel.createByteArray());
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f118517d.mo56225c()).mo56382g(e)).mo56372aa(54343)).mo56386p("Cannot read embedded parser details.");
        }
        this.f118519b = teVar;
        C66525q qVar = C66525q.f180929f;
        try {
            qVar = (C66525q) C62942bv.parseFrom((C62942bv) C66525q.f180929f, parcel.createByteArray());
        } catch (C62974ct e2) {
            ((C59052c) ((C59052c) ((C59052c) f118517d.mo56225c()).mo56382g(e2)).mo56372aa(54342)).mo56386p("Cannot read HypothesisResult.");
        }
        this.f118520c = qVar;
    }

    /* renamed from: a */
    public final String mo49355a(String str) {
        return (String) this.f118521e.get(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118518a);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f118521e.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.f118522f.entrySet()) {
            bundle2.putString((String) entry2.getKey(), (String) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
        parcel.writeByteArray(this.f118519b.toByteArray());
        parcel.writeByteArray(this.f118520c.toByteArray());
    }

    public TaggerResult(C66525q qVar, C60527te teVar) {
        this.f118518a = qVar.f180932b;
        this.f118519b = teVar;
        for (C66521m mVar : qVar.f180933c) {
            this.f118521e.put(mVar.f180922b, mVar.f180925e);
            this.f118522f.put(mVar.f180922b, mVar.f180926f);
        }
        this.f118520c = qVar;
    }
}
