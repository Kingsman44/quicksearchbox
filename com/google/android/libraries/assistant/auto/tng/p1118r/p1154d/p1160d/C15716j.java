package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import android.content.Context;
import com.google.android.libraries.assistant.auto.ondevice.p710d.p711a.C11874a;
import com.google.android.libraries.assistant.auto.ondevice.p710d.p711a.C11876c;
import com.google.android.libraries.assistant.auto.ondevice.p710d.p711a.C11877d;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.C15756i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.speech.p5218j.p5219a.C66710an;
import com.google.speech.p5218j.p5219a.C66711ao;
import dagger.C68214a;
import java.io.File;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.j */
/* compiled from: PG */
public final class C15716j implements C15756i {

    /* renamed from: a */
    private static final C58974d f46884a = C58974d.m91136j();

    /* renamed from: b */
    private static final C58485gu f46885b = C58485gu.m89847o("/system/usr/srec", "/product/usr/srec");

    /* renamed from: c */
    private C58833ax f46886c;

    /* renamed from: d */
    private C58833ax f46887d;

    /* renamed from: e */
    private final Context f46888e;

    /* renamed from: f */
    private final C68214a f46889f;

    /* renamed from: g */
    private final C69464a f46890g;

    public C15716j(Context context, C68214a aVar, C69464a aVar2) {
        C58836b bVar = C58836b.f156633a;
        this.f46886c = bVar;
        this.f46887d = bVar;
        this.f46888e = context;
        this.f46889f = aVar;
        this.f46890g = aVar2;
    }

    /* renamed from: a */
    public final C58833ax mo22525a(String str) {
        C58833ax axVar;
        boolean z;
        String parent;
        if (!this.f46886c.mo56113h() || !((String) this.f46887d.mo56107c()).equals(str)) {
            if (((Boolean) this.f46890g.mo17428b()).booleanValue()) {
                Optional a = ((C11874a) this.f46889f.mo27525b()).mo20268a(str, "metadata");
                if (!a.isPresent() || (parent = ((File) a.get()).getAbsoluteFile().getParent()) == null) {
                    ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46277)).mo56389s("MDD LP not found for locale %s! Checking system image but skipping NGA resources.", str);
                } else {
                    ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46278)).mo56354G("MDD LP found for locale %s at path %s!", str, parent);
                    axVar = C58833ax.m90834k(parent);
                    this.f46886c = axVar;
                    this.f46887d = C58833ax.m90834k(str);
                    ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46279)).mo56354G("Resolved SODA resource dir for %s: %s", str, this.f46886c);
                    return this.f46886c;
                }
            }
            C58485gu guVar = f46885b;
            int i = ((C58724pq) guVar).f156474d;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    File file = new File((String) guVar.get(i2), str);
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46283)).mo56389s("LP dir does not exist: %s", file.getAbsolutePath());
                    } else {
                        for (File file2 : listFiles) {
                            if (file2.getName().equals("metadata")) {
                                ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46282)).mo56389s("Found LP metadata file: %s", file2.getAbsolutePath());
                                z = true;
                                break;
                            }
                        }
                        ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46281)).mo56389s("No LP metadata found in: %s", file.getAbsolutePath());
                    }
                    z = false;
                    i2++;
                    if (z) {
                        ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46276)).mo56389s("Found system LP metadata file for locale %s. Assuming LP is valid.", str);
                        axVar = C58833ax.m90834k(file.getPath());
                        break;
                    }
                } else {
                    ((C58970a) ((C58970a) f46884a.mo56226d()).mo56372aa(46275)).mo56389s("No LPs found for locale %s. Offline speech recognition should fail", str);
                    axVar = C58836b.f156633a;
                    break;
                }
            }
            this.f46886c = axVar;
            this.f46887d = C58833ax.m90834k(str);
            ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46279)).mo56354G("Resolved SODA resource dir for %s: %s", str, this.f46886c);
            return this.f46886c;
        }
        ((C58970a) ((C58970a) f46884a.mo56224b()).mo56372aa(46280)).mo56354G("Returned cached SODA resource dir for %s: %s", this.f46887d, this.f46886c);
        return this.f46886c;
    }

    /* renamed from: b */
    public final Optional mo22526b(String str) {
        C11877d dVar = ((C11874a) this.f46889f.mo27525b()).f38218a;
        ((C58970a) ((C58970a) C11877d.f38231a.mo56224b()).mo56372aa(43743)).mo56389s("Getting SpeechContextualModelMetadata for locale %s.", str);
        C66710an anVar = (C66710an) C66711ao.f181474d.createBuilder();
        ((C58970a) ((C58970a) C11877d.f38231a.mo56224b()).mo56372aa(43737)).mo56389s("Getting speech client file group for locale: %s", str);
        if (((C11876c) dVar.f38232b.get(str)) == null) {
            ((C58970a) ((C58970a) C11877d.f38231a.mo56226d()).mo56372aa(43738)).mo56389s("Locale %s is not compatible", str);
        }
        ((C58970a) ((C58970a) C11877d.f38231a.mo56226d()).mo56372aa(43749)).mo56389s("No downloaded contextual models for locale %s", str);
        return Optional.empty();
    }

    /* renamed from: c */
    public final String mo22527c() {
        String absolutePath = this.f46888e.getCacheDir().getAbsolutePath();
        String str = File.separator;
        return absolutePath + str + "soda-offline";
    }
}
