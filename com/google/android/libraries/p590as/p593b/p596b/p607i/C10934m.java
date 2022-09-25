package com.google.android.libraries.p590as.p593b.p596b.p607i;

import android.net.Uri;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.p600d.C10862i;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42788l;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58670nq;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4541l.C59315ac;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.protobuf.C62942bv;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.as.b.b.i.m */
/* compiled from: PG */
public final class C10934m {

    /* renamed from: a */
    private static final C58974d f36046a = C58974d.m91136j();

    /* renamed from: b */
    private static final Pattern f36047b = Pattern.compile(String.format(Locale.US, "%s%s_%s_zipfile", new Object[]{"langpack-domain_", "([^_]*)", "([0-9]+)"}));

    /* renamed from: a */
    public static C10882h m25953a(String str) {
        Matcher matcher = f36047b.matcher(str);
        C58838bb.m90873h(matcher.matches(), "ClientFileGroup name %s does not fit the pattern of a zipfile-based LanguagePack! The caller should carefully check the name.", str);
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        return m25957e(group, Integer.parseInt(group2), 0);
    }

    /* renamed from: b */
    public static C10882h m25954b(C29690f fVar, C42813k kVar) {
        Matcher matcher = f36047b.matcher(fVar.f80411b);
        C58838bb.m90873h(matcher.matches(), "ClientFileGroup name %s does not fit the pattern of a zipfile-based LanguagePack! The caller should carefully check the name.", fVar);
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        group2.getClass();
        int parseInt = Integer.parseInt(group2);
        C29689e a = C29689e.m54781a(fVar.f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        if (a != C29689e.DOWNLOADED) {
            return m25957e(group, parseInt, (long) ((C28595b) Collection.EL.stream(fVar.f80416g).collect(C58670nq.f156403c)).f77800d);
        }
        try {
            String str = ((C28595b) Collection.EL.stream(fVar.f80416g).collect(C58670nq.f156403c)).f77799c;
            Uri parse = Uri.parse(str + "/metadata");
            C42788l lVar = new C42788l();
            lVar.f112052a = true;
            File file = (File) kVar.mo45889c(parse, lVar);
            try {
                C8476as asVar = (C8476as) C62942bv.parseFrom((C62942bv) C8476as.f29413p, new C59315ac(file).mo56803a());
                if (asVar.f29429o.size() == 0) {
                    ((C58970a) ((C58970a) f36046a.mo56226d()).mo56372aa(54022)).mo56352E("The metadata proto for [%s, %d] is depending on the legacy SupportedDomainIds list. Please migrate to the DomainToRecognizer map.", group, parseInt);
                }
                return C10882h.m25900n(group, parseInt, C10862i.m25883b(asVar), C10862i.m25882a(asVar), ((long) asVar.f29420e) * 1000);
            } catch (IOException e) {
                ((C58970a) ((C58970a) ((C58970a) f36046a.mo56226d()).mo56382g(e)).mo56372aa(54023)).mo56389s("LanguagePack did not have valid metadata file at path %s", file.getAbsolutePath());
                return m25957e(group, parseInt, 0);
            }
        } catch (IOException | NoSuchElementException e2) {
            ((C58970a) ((C58970a) ((C58970a) f36046a.mo56225c()).mo56382g(e2)).mo56372aa(54024)).mo56352E("LanguagePack %s-v%d seemed to be downloaded, it did not have a metadata file. Undefined behavior may result.", group, parseInt);
            return m25957e(group, parseInt, 0);
        }
    }

    /* renamed from: c */
    public static String m25955c(String str, int i) {
        return String.format(Locale.US, "%s%s_%s_zipfile", new Object[]{"langpack-domain_", str, Integer.toString(i)});
    }

    /* renamed from: d */
    public static boolean m25956d(String str) {
        return f36047b.matcher(str).matches();
    }

    /* renamed from: e */
    private static C10882h m25957e(String str, int i, long j) {
        return C10882h.m25900n(str, i, C58733pz.f156496a, C58729pv.f156485a, j);
    }
}
