package androidx.slice.widget;

/* renamed from: androidx.slice.widget.c */
/* compiled from: PG */
public final class C4147c {

    /* renamed from: a */
    public final int f13337a;

    /* renamed from: b */
    public final int f13338b;

    /* renamed from: c */
    public final int f13339c;

    /* renamed from: d */
    public final int f13340d;

    /* renamed from: e */
    public int f13341e = -1;

    /* renamed from: f */
    public int f13342f = -1;

    /* renamed from: g */
    public int f13343g = 0;

    /* renamed from: h */
    public int f13344h = -1;

    public C4147c(int i, int i2, int i3, int i4) {
        this.f13337a = i;
        this.f13338b = i2;
        this.f13339c = i3;
        this.f13340d = i4;
    }

    /* renamed from: a */
    public final void mo8735a(int i, int i2, int i3) {
        this.f13343g = i;
        this.f13341e = i2;
        this.f13342f = i3;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("mode=");
        int i = this.f13337a;
        if (i == 1) {
            str = "MODE SMALL";
        } else if (i == 2) {
            str = "MODE LARGE";
        } else if (i != 3) {
            str = "unknown mode: " + i;
        } else {
            str = "MODE SHORTCUT";
        }
        sb.append(str);
        sb.append(", actionType=");
        String str3 = "TIME_PICK";
        switch (this.f13338b) {
            case 0:
                str2 = "TOGGLE";
                break;
            case 1:
                str2 = "BUTTON";
                break;
            case 2:
                str2 = "SLIDER";
                break;
            case 3:
                str2 = "CONTENT";
                break;
            case 4:
                str2 = "SEE MORE";
                break;
            case 5:
                str2 = "SELECTION";
                break;
            case 6:
                str2 = "DATE_PICK";
                break;
            default:
                str2 = str3;
                break;
        }
        sb.append(str2);
        sb.append(", rowTemplateType=");
        int i2 = this.f13339c;
        switch (i2) {
            case -1:
                str3 = "SHORTCUT";
                break;
            case 0:
                str3 = "LIST";
                break;
            case 1:
                str3 = "GRID";
                break;
            case 2:
                str3 = "MESSAGING";
                break;
            case 3:
                str3 = "TOGGLE";
                break;
            case 4:
                str3 = "SLIDER";
                break;
            case 5:
                str3 = "PROGRESS";
                break;
            case 6:
                str3 = "SELECTION";
                break;
            case 7:
                str3 = "DATE_PICK";
                break;
            case 8:
                break;
            default:
                str3 = "unknown row type: " + i2;
                break;
        }
        sb.append(str3);
        sb.append(", rowIndex=");
        sb.append(this.f13340d);
        sb.append(", actionPosition=");
        int i3 = this.f13343g;
        sb.append(i3 != 0 ? i3 != 1 ? "CELL" : "END" : "START");
        sb.append(", actionIndex=");
        sb.append(this.f13341e);
        sb.append(", actionCount=");
        sb.append(this.f13342f);
        sb.append(", state=");
        sb.append(this.f13344h);
        return sb.toString();
    }
}
