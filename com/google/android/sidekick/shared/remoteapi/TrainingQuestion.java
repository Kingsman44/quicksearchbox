package com.google.android.sidekick.shared.remoteapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C7921ox;
import com.google.p375ai.p378b.C7927pc;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class TrainingQuestion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C45332d();

    /* renamed from: a */
    public final C7927pc f118460a;

    /* renamed from: b */
    private final Map f118461b;

    /* renamed from: c */
    private C7918ou f118462c;

    public TrainingQuestion(Map map, C7927pc pcVar, C7918ou ouVar) {
        if (map == null) {
            throw new IllegalArgumentException("stringDictionary cannot be null.");
        } else if (pcVar == null) {
            throw new IllegalArgumentException("questionTemplate cannot be null.");
        } else if (ouVar != null) {
            this.f118461b = map;
            this.f118460a = pcVar;
            this.f118462c = ouVar;
        } else {
            throw new IllegalArgumentException("question cannot be null.");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Map map = this.f118461b;
        HashMap hashMap = new HashMap();
        C7927pc pcVar = this.f118460a;
        if ((pcVar.f27851a & 8) != 0) {
            String str = pcVar.f27854d;
            hashMap.put(str, (String) map.get(str));
        }
        C7927pc pcVar2 = this.f118460a;
        if ((pcVar2.f27851a & 16) != 0) {
            String str2 = pcVar2.f27855e;
            hashMap.put(str2, (String) map.get(str2));
        }
        C7927pc pcVar3 = this.f118460a;
        if ((pcVar3.f27851a & 64) != 0) {
            String str3 = pcVar3.f27856f;
            hashMap.put(str3, (String) map.get(str3));
        }
        for (C7921ox oxVar : this.f118460a.f27859i) {
            String str4 = oxVar.f27837b;
            hashMap.put(str4, (String) map.get(str4));
        }
        for (C7921ox oxVar2 : this.f118460a.f27860j) {
            String str5 = oxVar2.f27837b;
            hashMap.put(str5, (String) map.get(str5));
        }
        for (C7921ox oxVar3 : this.f118460a.f27861k) {
            String str6 = oxVar3.f27837b;
            hashMap.put(str6, (String) map.get(str6));
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        ProtoLiteParcelable.m147140k(this.f118460a, parcel);
        ProtoLiteParcelable.m147140k(this.f118462c, parcel);
    }
}
