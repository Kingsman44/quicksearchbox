package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ar.d.b;
import com.google.android.apps.gsa.nga.engine.ar.d.c;
import com.google.android.apps.gsa.nga.engine.ar.d.d;
import com.google.android.apps.gsa.nga.engine.ar.d.e;
import com.google.android.apps.gsa.nga.engine.ar.d.f;
import com.google.android.apps.gsa.nga.engine.recognition.p6127l.C77829e;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.C60790c;
import java.io.File;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.an */
/* compiled from: PG */
public final class C77760an implements C77829e {

    /* renamed from: a */
    public static final String[] f214215a = {"/system/usr/srec", "/product/usr/srec"};

    /* renamed from: b */
    private static final C58974d f214216b = C58974d.m91136j();

    /* renamed from: c */
    private final Context f214217c;

    /* renamed from: d */
    private final f f214218d;

    /* renamed from: e */
    private final String[] f214219e;

    public C77760an(Context context, f fVar, String[] strArr) {
        this.f214217c = context;
        this.f214218d = fVar;
        this.f214219e = strArr;
    }

    /* renamed from: d */
    private static String m124764d(File file) {
        return String.valueOf(file.getPath()).concat(String.valueOf(File.separator));
    }

    /* renamed from: e */
    private static boolean m124765e(File file) {
        File[] listFiles;
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equals("metadata")) {
                ((C58970a) ((C58970a) f214216b.mo56224b()).mo56372aa(4448)).mo56389s("Found LP metadata file: %s", file2.getAbsolutePath());
                return true;
            }
        }
        ((C58970a) ((C58970a) f214216b.mo56224b()).mo56372aa(4447)).mo56389s("No LP metadata found in: %s", file.getAbsolutePath());
        return false;
    }

    /* renamed from: a */
    public final String mo72815a(Locale locale) {
        f fVar = this.f214218d;
        C80627v vVar = C80627v.GROUP_ID_UNSPECIFIED;
        Optional findFirst = Collection.EL.stream(fVar.a).sorted(Comparator.CC.comparing(b.a)).map(new c()).filter(d.a).map(e.a).findFirst();
        if (findFirst.isPresent()) {
            return String.valueOf(String.valueOf(findFirst.get())).concat(String.valueOf(File.separator));
        }
        if (locale.equals(Locale.ROOT)) {
            return BuildConfig.FLAVOR;
        }
        C90476a aVar = C91018d.f254254a;
        int i = 0;
        File file = new File(this.f214217c.getDir("g3_models", 0), locale.toLanguageTag());
        if (m124765e(file)) {
            return m124764d(file);
        }
        ((C58970a) ((C58970a) f214216b.mo56226d()).mo56372aa(4444)).mo56389s("SODA model not found in g3_models for %s", locale.toLanguageTag());
        String[] strArr = this.f214219e;
        while (i < 2) {
            String str = strArr[i];
            File file2 = new File(str, locale.toLanguageTag());
            if (!m124765e(file2)) {
                ((C58970a) ((C58970a) f214216b.mo56226d()).mo56372aa(4446)).mo56354G("SODA model not found in system image (%s) for %s", str, locale.toLanguageTag());
                i++;
            } else {
                ((C58970a) ((C58970a) f214216b.mo56224b()).mo56372aa(4445)).mo56354G("SODA model found in system image (%s) for %s", str, locale.toLanguageTag());
                return m124764d(file2);
            }
        }
        return m124764d(file);
    }

    /* renamed from: b */
    public final String mo72816b(Locale locale) {
        C90476a aVar = C91018d.f254254a;
        return C60790c.m92793a(this.f214217c.getDir("tisid", 0).getAbsolutePath(), locale.toLanguageTag(), "speaker.profiles");
    }

    /* renamed from: c */
    public final String mo72817c() {
        C90476a aVar = C91018d.f254254a;
        return C60790c.m92793a(this.f214217c.getCacheDir().getAbsolutePath(), "soda/");
    }
}
