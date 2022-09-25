package com.google.p4273bs.p4277b.p4278a.p4279a;

import android.os.ParcelFileDescriptor;
import com.google.android.libraries.mdi.C28593a;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C28597c;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4541l.C59341x;
import com.google.common.util.C60790c;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61910bt;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61960dp;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61965h;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61979v;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.bs.b.a.a.a */
/* compiled from: PG */
public final class C56461a {

    /* renamed from: a */
    private static final C58974d f150806a = C58974d.m91136j();

    /* renamed from: a */
    public static C29690f m88195a(File file) {
        File file2 = new File(file, "entities_names");
        File file3 = new File(file, "entities_metadata");
        File file4 = new File(file, "entities_names_filter");
        File file5 = new File(file, "entities_prefixes_filter");
        if (!file2.exists() || !file3.exists()) {
            ((C58970a) ((C58970a) f150806a.mo56226d()).mo56372aa(54905)).mo56389s("Names table and/or metadata table not present at %s, returning empty ClientFileGroup!", file);
            return C29690f.f80408m;
        }
        C28597c cVar = (C28597c) C29690f.f80408m.createBuilder();
        C28593a aVar = (C28593a) C28595b.f77795g.createBuilder();
        String format = String.format("personal:%s", new Object[]{"entities_names"});
        aVar.copyOnWrite();
        C28595b bVar = (C28595b) aVar.instance;
        format.getClass();
        bVar.f77797a |= 1;
        bVar.f77798b = format;
        String uri = file2.toURI().toString();
        aVar.copyOnWrite();
        C28595b bVar2 = (C28595b) aVar.instance;
        uri.getClass();
        bVar2.f77797a |= 2;
        bVar2.f77799c = uri;
        cVar.mo34275b((C28595b) aVar.build());
        C28593a aVar2 = (C28593a) C28595b.f77795g.createBuilder();
        String format2 = String.format("personal:%s", new Object[]{"entities_metadata"});
        aVar2.copyOnWrite();
        C28595b bVar3 = (C28595b) aVar2.instance;
        format2.getClass();
        bVar3.f77797a |= 1;
        bVar3.f77798b = format2;
        String uri2 = file3.toURI().toString();
        aVar2.copyOnWrite();
        C28595b bVar4 = (C28595b) aVar2.instance;
        uri2.getClass();
        bVar4.f77797a |= 2;
        bVar4.f77799c = uri2;
        cVar.mo34275b((C28595b) aVar2.build());
        if (file4.exists()) {
            C28593a aVar3 = (C28593a) C28595b.f77795g.createBuilder();
            String format3 = String.format("personal:%s", new Object[]{"entities_names_filter"});
            aVar3.copyOnWrite();
            C28595b bVar5 = (C28595b) aVar3.instance;
            format3.getClass();
            bVar5.f77797a |= 1;
            bVar5.f77798b = format3;
            String uri3 = file4.toURI().toString();
            aVar3.copyOnWrite();
            C28595b bVar6 = (C28595b) aVar3.instance;
            uri3.getClass();
            bVar6.f77797a |= 2;
            bVar6.f77799c = uri3;
            cVar.mo34275b((C28595b) aVar3.build());
        }
        if (file5.exists()) {
            C28593a aVar4 = (C28593a) C28595b.f77795g.createBuilder();
            String format4 = String.format("personal:%s", new Object[]{"entities_prefixes_filter"});
            aVar4.copyOnWrite();
            C28595b bVar7 = (C28595b) aVar4.instance;
            format4.getClass();
            bVar7.f77797a |= 1;
            bVar7.f77798b = format4;
            String uri4 = file4.toURI().toString();
            aVar4.copyOnWrite();
            C28595b bVar8 = (C28595b) aVar4.instance;
            uri4.getClass();
            bVar8.f77797a |= 2;
            bVar8.f77799c = uri4;
            cVar.mo34275b((C28595b) aVar4.build());
        }
        return (C29690f) cVar.build();
    }

    /* renamed from: b */
    public static C61910bt m88196b(File file, String str) {
        C59341x a;
        String str2;
        try {
            File c = m88197c(file, str);
            a = C59341x.m92227a();
            if (c != null) {
                if (c.exists()) {
                    File file2 = new File(c, "entities_names");
                    File file3 = new File(c, "entities_metadata");
                    File file4 = new File(c, "entities_names_filter");
                    File file5 = new File(c, "entities_prefixes_filter");
                    File file6 = new File(c, "model_version.pb");
                    ParcelFileDescriptor open = ParcelFileDescriptor.open(file2, 268435456);
                    a.mo56859c(open);
                    ParcelFileDescriptor open2 = ParcelFileDescriptor.open(file3, 268435456);
                    a.mo56859c(open2);
                    C61979v vVar = new C61979v();
                    vVar.f167509a = "personal";
                    vVar.mo58428g(open);
                    vVar.mo58426e(open2);
                    if (file4.exists()) {
                        ParcelFileDescriptor open3 = ParcelFileDescriptor.open(file4, 268435456);
                        a.mo56859c(open3);
                        vVar.f167510b = open3;
                    }
                    if (file5.exists()) {
                        ParcelFileDescriptor open4 = ParcelFileDescriptor.open(file5, 268435456);
                        a.mo56859c(open4);
                        vVar.f167511c = open4;
                    }
                    ParcelFileDescriptor open5 = ParcelFileDescriptor.open(file6, 268435456);
                    a.mo56859c(open5);
                    C61960dp i = vVar.mo58430i();
                    if (i == null) {
                        throw new NullPointerException("Null pkgSlice");
                    } else if (open5 != null) {
                        C61965h hVar = new C61965h(i, open5);
                        C58838bb.m90868c(hVar.f167438a.mo58436e().equals("personal"));
                        return hVar;
                    } else {
                        throw new NullPointerException("Null modelVersionProto");
                    }
                }
            }
            if (c == null) {
                str2 = "null";
            } else {
                str2 = c.getPath();
            }
            throw new FileNotFoundException("No model directory found at: " + str2);
        } catch (Exception e) {
            a.close();
            throw new IOException(e);
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: c */
    public static File m88197c(File file, String str) {
        C58833ax axVar;
        File file2 = new File(file, C60790c.m92793a("geller", C65753ak.PKG_ENTITIES.name() + "_" + str));
        File file3 = null;
        if (!file2.exists()) {
            return null;
        }
        long j = 0;
        for (File file4 : file2.listFiles()) {
            try {
                axVar = C58833ax.m90834k(Long.valueOf(Long.parseLong(file4.getName())));
            } catch (NumberFormatException e) {
                ((C58970a) ((C58970a) ((C58970a) f150806a.mo56226d()).mo56382g(e)).mo56372aa(54906)).mo56389s("Failed to parse timestamp from filename '%s', skipping", file4.getName());
                axVar = C58836b.f156633a;
            }
            if (axVar.mo56113h()) {
                long longValue = ((Long) axVar.mo56107c()).longValue();
                if (longValue > j) {
                    file3 = file4;
                    j = longValue;
                }
            }
        }
        return file3;
    }
}
