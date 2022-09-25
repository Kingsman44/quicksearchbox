package com.google.android.libraries.social.populous.storage;

import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42579n;
import com.google.android.libraries.social.populous.logging.C42591z;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.social.populous.storage.ag */
/* compiled from: PG */
public final /* synthetic */ class C42606ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42608ai f111796a;

    /* renamed from: b */
    public final /* synthetic */ long f111797b;

    /* renamed from: c */
    public final /* synthetic */ long f111798c;

    public /* synthetic */ C42606ag(C42608ai aiVar, long j, long j2) {
        this.f111796a = aiVar;
        this.f111797b = j;
        this.f111798c = j2;
    }

    public final void run() {
        C42608ai aiVar = this.f111796a;
        long j = this.f111797b;
        long j2 = this.f111798c;
        ArrayList<File> arrayList = new ArrayList<>();
        aiVar.mo45709b(arrayList, aiVar.f111801a, 0);
        for (File file : arrayList) {
            if (file.lastModified() > 0 && j - file.lastModified() > j2) {
                C42591z zVar = aiVar.f111802b;
                try {
                    file.delete();
                    zVar.mo45635e(58, C42576k.f111734a);
                } catch (Exception e) {
                    C42579n a = zVar.mo45631a(C42576k.f111734a);
                    a.mo45673h(16);
                    a.mo45674i(25);
                    a.mo45670e(e);
                    a.mo45666a();
                }
            }
        }
    }
}
