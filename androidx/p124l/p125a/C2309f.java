package androidx.p124l.p125a;

import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2363bk;
import androidx.p060c.C0985o;
import androidx.p124l.p126b.C2312b;
import androidx.p124l.p126b.C2313c;
import java.io.PrintWriter;

/* renamed from: androidx.l.a.f */
/* compiled from: PG */
public final class C2309f extends C2358bf {

    /* renamed from: a */
    public static final C2363bk f6459a = new C2308e();

    /* renamed from: b */
    public final C0985o f6460b = new C0985o(10);

    /* renamed from: c */
    public boolean f6461c = false;

    /* renamed from: a */
    public final C2306c mo5684a() {
        return (C2306c) this.f6460b.mo3726e(54321);
    }

    /* renamed from: b */
    public final void mo5685b(String str, PrintWriter printWriter) {
        if (this.f6460b.mo3725d() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = String.valueOf(str).concat("    ");
            for (int i = 0; i < this.f6460b.mo3725d(); i++) {
                C2306c cVar = (C2306c) this.f6460b.mo3727f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f6460b.mo3723c(i));
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                printWriter.print(concat);
                printWriter.print("mId=");
                printWriter.print(cVar.f6452h);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(concat);
                printWriter.print("mLoader=");
                printWriter.println(cVar.f6453i);
                C2313c cVar2 = cVar.f6453i;
                String concat2 = concat.concat("  ");
                printWriter.print(concat2);
                printWriter.print("mId=");
                printWriter.print(cVar2.f6469c);
                printWriter.print(" mListener=");
                printWriter.println(cVar2.f6475i);
                if (cVar2.f6471e || cVar2.f6474h) {
                    printWriter.print(concat2);
                    printWriter.print("mStarted=");
                    printWriter.print(cVar2.f6471e);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(cVar2.f6474h);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (cVar2.f6472f || cVar2.f6473g) {
                    printWriter.print(concat2);
                    printWriter.print("mAbandoned=");
                    printWriter.print(cVar2.f6472f);
                    printWriter.print(" mReset=");
                    printWriter.println(cVar2.f6473g);
                }
                C2312b bVar = (C2312b) cVar2;
                if (bVar.f6466a != null) {
                    printWriter.print(concat2);
                    printWriter.print("mTask=");
                    printWriter.print(bVar.f6466a);
                    printWriter.print(" waiting=");
                    boolean z = bVar.f6466a.f6464a;
                    printWriter.println(false);
                }
                if (bVar.f6467b != null) {
                    printWriter.print(concat2);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(bVar.f6467b);
                    printWriter.print(" waiting=");
                    boolean z2 = bVar.f6467b.f6464a;
                    printWriter.println(false);
                }
                if (cVar.f6454j != null) {
                    printWriter.print(concat);
                    printWriter.print("mCallbacks=");
                    printWriter.println(cVar.f6454j);
                    C2307d dVar = cVar.f6454j;
                    printWriter.print(concat.concat("  "));
                    printWriter.print("mDeliveredData=");
                    printWriter.println(dVar.f6458c);
                }
                printWriter.print(concat);
                printWriter.print("mData=");
                C2313c cVar3 = cVar.f6453i;
                printWriter.println(C2313c.m6258f(cVar.mo3842a()));
                printWriter.print(concat);
                printWriter.print("mStarted=");
                printWriter.println(cVar.mo5709m());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        int d = this.f6460b.mo3725d();
        for (int i = 0; i < d; i++) {
            ((C2306c) this.f6460b.mo3727f(i)).mo5680n();
        }
        this.f6460b.mo3728g();
    }
}
