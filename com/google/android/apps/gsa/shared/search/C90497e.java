package com.google.android.apps.gsa.shared.search;

import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.latency.LatencyEvents;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.search.p7138b.C90488d;
import com.google.android.apps.gsa.shared.speech.HotwordResultMetadata;
import com.google.android.apps.gsa.shared.util.C90741ay;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.CorrectionSpan;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.search.e */
/* compiled from: PG */
final class C90497e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        CharSequence charSequence;
        amo amo;
        C90488d dVar;
        CharSequence valueOf;
        Parcel parcel2 = parcel;
        C59071e eVar = Query.f252740a;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        try {
            int readInt = parcel.readInt();
            if (readInt == 0) {
                valueOf = C90741ay.m148209a(charSequence2);
            } else {
                SpannableString valueOf2 = SpannableString.valueOf(charSequence2);
                for (int i = 0; i < readInt; i++) {
                    valueOf2.setSpan((CorrectionSpan) CorrectionSpan.CREATOR.createFromParcel(parcel2), parcel.readInt(), parcel.readInt(), parcel.readInt());
                }
                valueOf = SpannedString.valueOf(valueOf2);
            }
            charSequence = valueOf;
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) C90741ay.f253816a.mo56226d()).mo56382g(e)).mo56372aa(11325)).mo56386p("Failed to parse Parcel");
            charSequence = null;
        }
        ArrayList arrayList = new ArrayList();
        parcel2.readStringList(arrayList);
        C58485gu j = C58485gu.m89842j(arrayList);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        C58495hd l = C58495hd.m89898l(C90772bp.m148314v(parcel.readBundle()));
        int readInt4 = parcel.readInt();
        String readString3 = parcel.readString();
        long readLong3 = parcel.readLong();
        Long l2 = (Long) parcel2.readValue(Long.class.getClassLoader());
        byte[] createByteArray = parcel.createByteArray();
        Location location = (Location) parcel2.readParcelable(Location.class.getClassLoader());
        Bundle readBundle = parcel2.readBundle(Query.class.getClassLoader());
        Uri uri = (Uri) parcel2.readParcelable(Uri.class.getClassLoader());
        long readLong4 = parcel.readLong();
        LatencyEvents latencyEvents = (LatencyEvents) parcel2.readParcelable(LatencyEvents.class.getClassLoader());
        long readLong5 = parcel.readLong();
        long readLong6 = parcel.readLong();
        long readLong7 = parcel.readLong();
        int readInt5 = parcel.readInt();
        long readLong8 = parcel.readLong();
        long readLong9 = parcel.readLong();
        long readLong10 = parcel.readLong();
        int readInt6 = parcel.readInt();
        boolean z = parcel.readByte() != 0;
        QueryTriggerType queryTriggerType = (QueryTriggerType) parcel2.readParcelable(QueryTriggerType.class.getClassLoader());
        C58495hd l3 = C58495hd.m89898l(C90772bp.m148314v(parcel.readBundle()));
        int readInt7 = parcel.readInt();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        HotwordResultMetadata hotwordResultMetadata = (HotwordResultMetadata) parcel2.readParcelable(HotwordResultMetadata.class.getClassLoader());
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        Integer num = (Integer) parcel2.readValue(Integer.class.getClassLoader());
        if (num == null) {
            amo = null;
        } else {
            amo = amo.m92435a(num.intValue());
        }
        C90208n a = C90208n.m146767a(parcel.readInt());
        String readString9 = parcel.readString();
        int readInt8 = parcel.readInt();
        C90488d dVar2 = C90488d.f252873g;
        byte[] bArr = new byte[parcel.readInt()];
        parcel2.readByteArray(bArr);
        try {
            dVar = (C90488d) C62942bv.parseFrom((C62942bv) C90488d.f252873g, bArr);
        } catch (C62974ct e2) {
            C59104x c = Query.f252740a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Velvet.Query");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(11021)).mo56386p("Could not parse the query proto, leaving fields at default values.");
            dVar = dVar2;
        }
        return new Query(readLong, readLong2, charSequence == null ? BuildConfig.FLAVOR : charSequence, j, readString, readString2, readInt2, readInt3, readInt4, readString3, l, readLong3, l2, createByteArray, (C60456qs) null, location, readBundle, uri, readLong4, latencyEvents, readLong5, readLong6, readLong7, readInt5, readLong8, readLong9, readLong10, readInt6, z, queryTriggerType, l3, readInt7, readString4, readString5, hotwordResultMetadata, readString6, readString7, readString8, amo, a, readString9, readInt8, dVar);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Query[i];
    }
}
