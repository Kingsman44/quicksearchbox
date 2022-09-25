package com.google.android.libraries.social.populous.storage;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.social.populous.storage.ai */
/* compiled from: PG */
public final class C42608ai implements C42605af {

    /* renamed from: a */
    public final File f111801a;

    /* renamed from: b */
    public final C42591z f111802b;

    /* renamed from: c */
    private final C58485gu f111803c;

    /* renamed from: d */
    private final FilenameFilter f111804d;

    /* renamed from: e */
    private final C21370a f111805e;

    /* renamed from: f */
    private final C60887da f111806f;

    public C42608ai(File file, C58485gu guVar, FilenameFilter filenameFilter, C21370a aVar, C60887da daVar, C42591z zVar) {
        this.f111801a = file;
        this.f111803c = guVar;
        this.f111804d = filenameFilter;
        this.f111805e = aVar;
        this.f111806f = daVar;
        this.f111802b = zVar;
    }

    /* renamed from: a */
    public final void mo45707a(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        long b = this.f111805e.mo26870b();
        if (b <= 0) {
            this.f111802b.mo45635e(60, C42576k.f111734a);
            return;
        }
        C60856cj.m92911t(this.f111806f.mo19398a(new C42606ag(this, b, millis)), new C42607ah(this, this.f111802b.mo45632b()), this.f111806f);
    }

    /* renamed from: b */
    public final void mo45709b(List list, File file, int i) {
        C58485gu guVar = this.f111803c;
        if (i < ((C58724pq) guVar).f156474d) {
            for (File b : file.listFiles((FileFilter) guVar.get(i))) {
                mo45709b(list, b, i + 1);
            }
            return;
        }
        Collections.addAll(list, file.listFiles(this.f111804d));
    }
}
