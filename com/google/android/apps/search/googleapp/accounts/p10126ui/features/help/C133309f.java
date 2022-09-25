package com.google.android.apps.search.googleapp.accounts.p10126ui.features.help;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.io.FileInputStream;
import java.io.IOException;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.accounts.ui.features.help.HelpAndFeedbackDataService$getSavedScreenshot$2", mo61344c = "HelpAndFeedbackDataService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.help.f */
/* compiled from: PG */
final class C133309f extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C133311h f363262a;

    /* renamed from: b */
    final /* synthetic */ String f363263b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133309f(C133311h hVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f363262a = hVar;
        this.f363263b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133309f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        try {
            FileInputStream openFileInput = this.f363262a.f363268b.openFileInput(this.f363263b);
            C69664n.m101060f(openFileInput, "context.openFileInput(screenshotName)");
            Bitmap decodeStream = BitmapFactory.decodeStream(openFileInput);
            this.f363262a.f363268b.deleteFile(this.f363263b);
            return decodeStream;
        } catch (IOException e) {
            C59052c cVar = (C59052c) ((C59052c) C133311h.f363267a.mo56226d()).mo56382g(e);
            String str = this.f363263b;
            cVar.mo56379ah(new C59094n(40029));
            cVar.mo56389s("Unable to read screenshot from file: %s", str);
            this.f363262a.f363268b.deleteFile(this.f363263b);
            return null;
        } catch (Throwable th) {
            this.f363262a.f363268b.deleteFile(this.f363263b);
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133309f(this.f363262a, this.f363263b, gVar);
    }
}
