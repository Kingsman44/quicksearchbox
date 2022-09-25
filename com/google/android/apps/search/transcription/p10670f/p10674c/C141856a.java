package com.google.android.apps.search.transcription.p10670f.p10674c;

import com.google.android.apps.search.transcription.p10666b.C141757p;
import com.google.android.apps.search.transcription.p10670f.p10675d.C141861a;
import com.google.android.apps.search.transcription.p10670f.p10675d.C141862b;
import com.google.android.libraries.assistant.soda.C19238aa;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5218j.C67152mz;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.transcription.f.c.a */
/* compiled from: PG */
public final /* synthetic */ class C141856a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C141857b f384950a;

    /* renamed from: b */
    public final /* synthetic */ String f384951b;

    public /* synthetic */ C141856a(C141857b bVar, String str) {
        this.f384950a = bVar;
        this.f384951b = str;
    }

    public final Object call() {
        C141857b bVar = this.f384950a;
        String str = this.f384951b;
        String path = new File(bVar.f384952a.getDir("g3_models", 0).getPath(), str).getPath();
        try {
            C141861a aVar = (C141861a) C141862b.f384956d.createBuilder();
            C58485gu guVar = C19238aa.f53914b;
            if (C19238aa.m36671a(path)) {
                C58801sm G = guVar.listIterator(0);
                while (G.hasNext()) {
                    String path2 = new File((String) G.next(), str).getPath();
                    if (!C19238aa.m36671a(path2)) {
                        ((C59052c) ((C59052c) C19238aa.f53913a.mo56224b()).mo56372aa(47662)).mo56354G("LP directory (%s) is empty. Using LP from sysimg (%s).", path, path2);
                        path = path2;
                    }
                }
                throw new FileNotFoundException("No language pack found!");
            }
            aVar.copyOnWrite();
            C141862b bVar2 = (C141862b) aVar.instance;
            path.getClass();
            bVar2.f384958a |= 2;
            bVar2.f384960c = path;
            return (C141862b) aVar.build();
        } catch (FileNotFoundException unused) {
            throw new C141757p(C67152mz.INVALID_CONFIG);
        }
    }
}
