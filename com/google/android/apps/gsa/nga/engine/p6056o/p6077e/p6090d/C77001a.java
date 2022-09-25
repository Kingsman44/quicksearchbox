package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.a */
/* compiled from: PG */
final class C77001a implements Comparator {

    /* renamed from: a */
    private static final C58974d f212545a = C58974d.m91136j();

    /* renamed from: a */
    public static final int m123678a(String str, String str2) {
        String[] split = str.split("\\.", -1);
        String[] split2 = str2.split("\\.", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            String str3 = split[i];
            String str4 = split2[i];
            Optional b = m123679b(str3);
            Optional b2 = m123679b(str4);
            int compareTo = (!b.isPresent() || !b2.isPresent()) ? str3.compareTo(str4) : ((Long) b.get()).compareTo((Long) b2.get());
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return split.length - split2.length;
    }

    /* renamed from: b */
    private static Optional m123679b(String str) {
        try {
            return Optional.m71637of(Long.valueOf(Long.parseLong(str)));
        } catch (Exception e) {
            ((C58970a) ((C58970a) ((C58970a) f212545a.mo56226d()).mo56382g(e)).mo56372aa(3798)).mo56386p("Error while trying to parse version name.");
            return Optional.empty();
        }
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        throw null;
    }
}
