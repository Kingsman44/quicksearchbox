package com.google.android.libraries.assistant.soda;

import android.os.Process;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.speech.p5218j.C67153n;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.assistant.soda.s */
/* compiled from: PG */
public final /* synthetic */ class C19351s implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C19389y f54150a;

    /* renamed from: b */
    public final /* synthetic */ int f54151b;

    /* renamed from: c */
    public final /* synthetic */ int f54152c;

    /* renamed from: d */
    public final /* synthetic */ InputStream f54153d;

    /* renamed from: e */
    public final /* synthetic */ C58833ax f54154e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f54155f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f54156g;

    public /* synthetic */ C19351s(C19389y yVar, int i, int i2, InputStream inputStream, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f54150a = yVar;
        this.f54151b = i;
        this.f54152c = i2;
        this.f54153d = inputStream;
        this.f54154e = axVar;
        this.f54155f = axVar2;
        this.f54156g = axVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C19389y yVar = this.f54150a;
        int i = this.f54151b;
        int i2 = this.f54152c;
        InputStream inputStream = this.f54153d;
        C58833ax axVar = this.f54154e;
        C58833ax axVar2 = this.f54155f;
        boolean booleanValue = ((Boolean) this.f54156g.mo56109e(Boolean.valueOf(yVar.f54241g))).booleanValue();
        if (!yVar.mo24536i() || ((C19241ad) yVar.f54240f.mo56107c()).mo24356w()) {
            return C60856cj.m92899h(new IllegalStateException("SODA is not ready for startCapture"));
        }
        int i3 = 0;
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(true != booleanValue ? threadPriority : -16);
            C19241ad adVar = (C19241ad) yVar.f54240f.mo56107c();
            C66751r rVar = (C66751r) C66752s.f181544q.createBuilder();
            C19245ah.m36702j(rVar, i, i2);
            boolean z = yVar.f54237c;
            rVar.copyOnWrite();
            C66752s sVar = (C66752s) rVar.instance;
            sVar.f181546a |= 2;
            sVar.f181548c = z;
            if (true == yVar.f54238d) {
                i3 = 500;
            }
            rVar.copyOnWrite();
            C66752s sVar2 = (C66752s) rVar.instance;
            sVar2.f181546a |= 128;
            sVar2.f181554i = i3;
            rVar.copyOnWrite();
            C66752s sVar3 = (C66752s) rVar.instance;
            sVar3.f181546a |= 1;
            sVar3.f181547b = true;
            if (axVar2.mo56113h()) {
                C66722az azVar = (C66722az) axVar2.mo56107c();
                rVar.copyOnWrite();
                C66752s sVar4 = (C66752s) rVar.instance;
                azVar.getClass();
                sVar4.f181552g = azVar;
                sVar4.f181546a |= 32;
            }
            C67153n nVar = yVar.f54239e;
            if (nVar != null) {
                rVar.copyOnWrite();
                C66752s sVar5 = (C66752s) rVar.instance;
                sVar5.f181555j = nVar;
                sVar5.f181546a |= 256;
            }
            cxVar = adVar.mo24325b((C66752s) rVar.build(), inputStream, axVar);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) C19389y.f54228a.mo56225c()).mo56382g(e)).mo56372aa(47643)).mo56386p("SODA failed to start capturing.");
            cxVar = C60856cj.m92899h(new IllegalStateException("SODA failed to start capturing"));
        } catch (Throwable th) {
            Process.setThreadPriority(threadPriority);
            throw th;
        }
        Process.setThreadPriority(threadPriority);
        return cxVar;
    }
}
