package com.google.android.apps.search.sceneviewer.p10647b;

import android.content.Intent;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.sceneviewer.b.b */
/* compiled from: PG */
public final class C141534b {

    /* renamed from: e */
    private static final C59071e f384163e = C59071e.m91332i("com.google.android.apps.search.sceneviewer.b.b");

    /* renamed from: a */
    public final Types.StreamingSettings f384164a;

    /* renamed from: b */
    public final C58528ij f384165b;

    /* renamed from: c */
    public final C58528ij f384166c;

    /* renamed from: d */
    public final C58528ij f384167d;

    public C141534b(Types.StreamingSettings streamingSettings) {
        this.f384165b = C58528ij.m90008H(streamingSettings.getReferrers().split(","));
        C58528ij.m90008H(streamingSettings.getDynamicInfoCardReferrers().split(","));
        this.f384166c = C58528ij.m90008H(streamingSettings.getAllowedDomains().split(","));
        this.f384167d = C58528ij.m90008H(streamingSettings.getAllowedApiKeys().split(","));
        this.f384164a = streamingSettings;
    }

    /* renamed from: a */
    public static Types.StreamingSettings m229755a(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(Types.StreamingSettings.class.getSimpleName());
        if (byteArrayExtra == null) {
            return null;
        }
        try {
            return Types.StreamingSettings.parseFrom(byteArrayExtra, C62921ba.m95368a());
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) f384163e.mo56224b()).mo56372aa(41728)).mo56386p("Unable to parse StreamingSettings from intent");
            return null;
        }
    }
}
