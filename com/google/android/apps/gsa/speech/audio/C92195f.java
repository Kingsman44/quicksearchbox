package com.google.android.apps.gsa.speech.audio;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.speech.audio.f */
/* compiled from: PG */
public final class C92195f {

    /* renamed from: a */
    public static final C59071e f257041a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.f");

    /* renamed from: b */
    public final Context f257042b;

    /* renamed from: c */
    public final C22871g f257043c;

    /* renamed from: d */
    public final C92185e f257044d;

    /* renamed from: e */
    private final C21370a f257045e;

    /* renamed from: f */
    private final C68214a f257046f;

    public C92195f(Context context, C22871g gVar, C21370a aVar, C68214a aVar2, C92185e eVar) {
        this.f257042b = context;
        this.f257043c = gVar;
        this.f257045e = aVar;
        this.f257046f = aVar2;
        this.f257044d = eVar;
    }

    /* renamed from: a */
    public static C92173d m151371a(C90584f fVar) {
        if (fVar == null) {
            return C92173d.UNKNOWN;
        }
        int ordinal = fVar.ordinal();
        if (ordinal == 1) {
            return C92173d.OK_GOOGLE;
        }
        if (ordinal != 2) {
            return C92173d.UNKNOWN;
        }
        return C92173d.OK_HEY_GOOGLE;
    }

    /* renamed from: o */
    public static final File m151372o(File file, String str) {
        File file2 = new File(file, str);
        if (file2.isFile()) {
            return file2;
        }
        return null;
    }

    /* renamed from: p */
    private final HashMap m151373p(String str, C92173d dVar) {
        String group;
        HashMap hashMap = new HashMap();
        File d = mo86857d(dVar);
        String[] list = d.list();
        if (list != null) {
            C58759qy qyVar = new C58759qy(dVar.name());
            Pattern compile = Pattern.compile(String.format("^([0-9]*)\\-(.*)\\-(.*)\\.%s$", new Object[]{Pattern.quote(this.f257044d.f257013d)}));
            for (String str2 : list) {
                Matcher matcher = compile.matcher(str2);
                if (matcher.matches() && TextUtils.equals(matcher.group(2), str) && (group = matcher.group(3)) != null && qyVar.f156534a.equals(group)) {
                    File o = m151372o(d, str2);
                    if (o == null) {
                        ((C59052c) ((C59052c) f257041a.mo56224b()).mo56372aa(12032)).mo56386p("File is gone.");
                    } else if (hashMap.get(group) == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(o);
                        hashMap.put(group, arrayList);
                    } else {
                        ((List) hashMap.get(group)).add(o);
                    }
                }
            }
        } else {
            ((C59052c) ((C59052c) f257041a.mo56226d()).mo56372aa(12031)).mo56389s("Not a directory: %s", d.getAbsolutePath());
            int i = C90755l.f253831a;
        }
        return hashMap;
    }

    /* renamed from: c */
    public final File mo86856c() {
        C90748e.m148224b();
        return this.f257042b.getDir(this.f257044d.f257012c, 0);
    }

    /* renamed from: d */
    public final File mo86857d(C92173d dVar) {
        File c = mo86856c();
        if (dVar != C92173d.OK_HEY_GOOGLE_ADAPTATION_PENDING && dVar != C92173d.OK_HEY_GOOGLE_ADAPTATION_VERIFIED) {
            return c;
        }
        File file = new File(c, "adaptation");
        file.mkdir();
        return file;
    }

    /* renamed from: e */
    public final File mo86858e(String str, C92173d dVar) {
        String str2;
        if (dVar == null || dVar == C92173d.UNKNOWN) {
            str2 = String.format("%s-%s.%s", new Object[]{Long.valueOf(this.f257045e.mo26870b()), str, this.f257044d.f257013d});
        } else {
            str2 = String.format("%s-%s-%s.%s", new Object[]{Long.valueOf(this.f257045e.mo26870b()), str, dVar.name(), this.f257044d.f257013d});
        }
        return new File(mo86857d(dVar), str2);
    }

    /* renamed from: f */
    public final File mo86859f() {
        return new File(this.f257042b.getExternalCacheDir(), "logs.zip");
    }

    /* renamed from: g */
    public final List mo86860g(String str) {
        File o;
        ArrayList arrayList = new ArrayList();
        File c = mo86856c();
        String[] list = c.list();
        if (list != null) {
            Pattern compile = Pattern.compile(String.format("^([0-9]*)\\-(.*)\\.%s$", new Object[]{Pattern.quote(this.f257044d.f257013d)}));
            for (String str2 : list) {
                Matcher matcher = compile.matcher(str2);
                if (matcher.matches() && ((str == null || TextUtils.equals(matcher.group(2), str)) && (o = m151372o(c, str2)) != null)) {
                    arrayList.add(o);
                }
            }
        } else {
            ((C59052c) ((C59052c) f257041a.mo56226d()).mo56372aa(12035)).mo56389s("Not a directory: %s", c.getAbsolutePath());
            int i = C90755l.f253831a;
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List mo86861h(String str, C92173d dVar) {
        return (List) mo86862i(str, dVar).get(dVar.name());
    }

    /* renamed from: i */
    public final Map mo86862i(String str, C92173d dVar) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        HashMap p = m151373p(str, dVar);
        if (this.f257044d != C92185e.f257011b || !p.isEmpty() || dVar != C92173d.OK_HEY_GOOGLE) {
            return p;
        }
        ((C59052c) ((C59052c) f257041a.mo56224b()).mo56372aa(12042)).mo56386p("No audio utterances for X_GOOGLE, checking TISID");
        return m151373p(str, C92173d.TISID_ENROLLMENT);
    }

    /* renamed from: j */
    public final void mo86863j(String str, long j) {
        for (File file : mo86860g(str)) {
            if (j == -1) {
                mo86865l(file);
            } else if (mo86867n(file, j, "^([0-9]*)\\-(.*)\\.%s$")) {
                mo86865l(file);
            }
        }
        HashMap hashMap = new HashMap();
        for (C92173d i : C92173d.values()) {
            hashMap.putAll(mo86862i(str, i));
        }
        for (String str2 : hashMap.keySet()) {
            List<File> list = (List) hashMap.get(str2);
            if (list != null) {
                for (File file2 : list) {
                    if (j == -1) {
                        mo86865l(file2);
                    } else if (mo86867n(file2, j, "^([0-9]*)\\-(.*)\\-(.*)\\.%s$")) {
                        mo86865l(file2);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo86864k(String str, long j) {
        HashMap hashMap = new HashMap();
        for (C92173d i : C92173d.values()) {
            hashMap.putAll(mo86862i(str, i));
        }
        for (String str2 : hashMap.keySet()) {
            List<File> list = (List) hashMap.get(str2);
            if (list != null) {
                int i2 = 0;
                for (File file : list) {
                    if (!mo86867n(file, j, "^([0-9]*)\\-(.*)\\-(.*)\\.%s$")) {
                        i2++;
                        mo86865l(file);
                    }
                }
                ((C59052c) ((C59052c) f257041a.mo56224b()).mo56372aa(12044)).mo56395y("Performed %d delete operations on %s file type.", i2, str2);
            }
        }
    }

    /* renamed from: l */
    public final void mo86865l(File file) {
        if (!file.delete()) {
            ((C59052c) ((C59052c) f257041a.mo56225c()).mo56372aa(12046)).mo56389s("Could not delete audio files from folder: %s", this.f257044d.f257012c);
        }
    }

    /* renamed from: m */
    public final void mo86866m(C118569b bVar) {
        C68214a aVar = this.f257046f;
        if (aVar != null) {
            ((C118827a) aVar.mo27525b()).mo77944g(bVar, C118575h.SPEAKER_ID_ADAPTATION).mo104025g(1);
        }
    }

    /* renamed from: n */
    public final boolean mo86867n(File file, long j, String str) {
        long b = this.f257045e.mo26870b() - TimeUnit.SECONDS.toMillis(j);
        Matcher matcher = Pattern.compile(String.format(str, new Object[]{Pattern.quote(this.f257044d.f257013d)})).matcher(file.getName());
        if (matcher.matches()) {
            try {
                if (Long.parseLong(matcher.group(1)) < b) {
                    return true;
                }
                return false;
            } catch (NumberFormatException e) {
                ((C59052c) ((C59052c) ((C59052c) f257041a.mo56225c()).mo56382g(e)).mo56372aa(12060)).mo56389s("Could not find file timestamp file-%s.", file);
                return false;
            }
        } else {
            ((C59052c) ((C59052c) f257041a.mo56226d()).mo56372aa(12059)).mo56386p("#isFileOlderThan Incorrect file format.");
            return false;
        }
    }

    /* renamed from: b */
    public final C60870cx mo86855b(byte[] bArr, String str, C92173d dVar) {
        if (dVar == null && this.f257044d == C92185e.f257011b) {
            return C60856cj.m92899h(new IllegalArgumentException("Should provide audio type for enrollment audio."));
        }
        if (bArr == null || bArr.length == 0) {
            return C60856cj.m92899h(new IllegalArgumentException("Empty audio, skipping."));
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException unused) {
        }
        return this.f257043c.mo28201a("Dump audio file", new C92160c(this, bArr, str, dVar));
    }
}
