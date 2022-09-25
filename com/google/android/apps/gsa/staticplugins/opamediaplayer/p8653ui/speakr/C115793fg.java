package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.protos.p4985f.p4988b.p4992c.C64760h;
import com.google.protos.p4985f.p4988b.p4992c.C64761i;
import com.google.protos.p4985f.p4988b.p4992c.C64768p;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fg */
/* compiled from: PG */
public final class C115793fg {
    /* renamed from: a */
    public static String m191934a(C64768p pVar) {
        StringBuilder sb = new StringBuilder();
        for (C64761i iVar : pVar.f175566a) {
            Object[] objArr = new Object[2];
            int a = C64760h.m96456a(iVar.f175550c);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            objArr[0] = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "default" : "caption" : "section-title" : "title" : "normal";
            objArr[1] = iVar.f175549b;
            sb.append(String.format("<div class=\"%s\">%s</div>", objArr));
            sb.append("\n");
        }
        return String.format("<html><head><meta name=\"viewport\" content=\"target-densitydpi=xhdpi, width=device-width, initial-scale=1\"><link rel=\"stylesheet\" href=\"style.css\"></head><body>%s</body></html>", new Object[]{sb});
    }
}
