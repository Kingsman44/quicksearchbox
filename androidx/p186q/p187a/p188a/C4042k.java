package androidx.p186q.p187a.p188a;

import android.content.Context;
import androidx.p186q.p187a.C4048c;
import java.io.File;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.q.a.a.k */
/* compiled from: PG */
final class C4042k extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C4043l f12921a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4042k(C4043l lVar) {
        super(0);
        this.f12921a = lVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C4041j jVar;
        C4043l lVar = this.f12921a;
        String str = lVar.f12923b;
        if (str == null || !lVar.f12925d) {
            Context context = lVar.f12922a;
            C4036e eVar = new C4036e();
            C4043l lVar2 = this.f12921a;
            jVar = new C4041j(context, str, eVar, lVar2.f12924c, lVar2.f12926e);
        } else {
            File noBackupFilesDir = lVar.f12922a.getNoBackupFilesDir();
            C69664n.m101060f(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, this.f12921a.f12923b);
            Context context2 = this.f12921a.f12922a;
            String absolutePath = file.getAbsolutePath();
            C4036e eVar2 = new C4036e();
            C4043l lVar3 = this.f12921a;
            jVar = new C4041j(context2, absolutePath, eVar2, lVar3.f12924c, lVar3.f12926e);
        }
        C4048c.m11584a(jVar, this.f12921a.f12927f);
        return jVar;
    }
}
