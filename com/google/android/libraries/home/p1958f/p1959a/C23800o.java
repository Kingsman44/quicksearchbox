package com.google.android.libraries.home.p1958f.p1959a;

import androidx.preference.PreferenceGroup;
import com.google.assistant.p3861at.C50181no;
import com.google.protobuf.C62921ba;
import com.google.protobuf.MessageLite;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.Iterator;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69734n;

/* renamed from: com.google.android.libraries.home.f.a.o */
/* compiled from: PG */
public final class C23800o {
    /* renamed from: a */
    public static final C50181no m44333a(ProtoParsers.ParcelableProto parcelableProto) {
        MessageLite a = parcelableProto.mo58938a(C50181no.f130444i, C62921ba.m95368a());
        C69664n.m101060f(a, "getMessage(\n          Ho…ratedRegistry()\n        )");
        return (C50181no) a;
    }

    /* renamed from: b */
    public static final Iterator m44334b(PreferenceGroup preferenceGroup) {
        C69664n.m101061g(preferenceGroup, "<this>");
        return C69734n.m101171a(new C23799n(preferenceGroup, (C69577g) null));
    }
}
